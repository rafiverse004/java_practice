/*
PROBLEM 15:
Design a multi-layered banking domain model:
- Accounts, Transactions, Services
- Apply OOP patterns like Factory and Strategy
*/

// WHAT YOU ARE LEARNING:
// Composition, Inheritance, Strategy Pattern, Factory Pattern, Polymorphism

import java.util.ArrayList;
import java.util.List;

// --- Strategy Pattern for interest calculation ---
interface InterestStrategy {
    double calculateInterest(double balance);
}

class FixedInterest implements InterestStrategy {
    private double rate;
    public FixedInterest(double rate) { this.rate = rate; }
    @Override
    public double calculateInterest(double balance) {
        return balance * rate;
    }
}

class NoInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) { return 0; }
}

// --- Account base class ---
abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected InterestStrategy interestStrategy;

    public Account(String accountNumber, double balance, InterestStrategy strategy) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestStrategy = strategy;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double getBalance() { return balance; }

    public double applyInterest() {
        double interest = interestStrategy.calculateInterest(balance);
        balance += interest;
        return interest;
    }
}

// SavingsAccount → fixed interest
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, new FixedInterest(0.05));
    }
}

// CheckingAccount → no interest
class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance, new NoInterest());
    }
}

// --- Transaction class ---
class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public void show() {
        System.out.println(description + ": $" + amount);
    }
}

// --- Factory Pattern for account creation ---
class AccountFactory {
    public static Account createAccount(String type, String accNo, double balance) {
        switch(type.toUpperCase()) {
            case "SAVINGS": return new SavingsAccount(accNo, balance);
            case "CHECKING": return new CheckingAccount(accNo, balance);
            default: throw new IllegalArgumentException("Invalid account type");
        }
    }
}

// --- BankService class for operations ---
class BankService {

    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void showBalances() {
        for (Account acc : accounts) {
            System.out.println(acc.accountNumber + " Balance: $" + acc.getBalance());
        }
    }
}

// Main class comes last
public class MultiLayeredBankingDomainModelMain {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        Account acc1 = AccountFactory.createAccount("SAVINGS", "A101", 1000);
        Account acc2 = AccountFactory.createAccount("CHECKING", "C202", 500);

        bankService.addAccount(acc1);
        bankService.addAccount(acc2);

        acc1.deposit(200);
        acc2.withdraw(100);

        System.out.println("Before interest:");
        bankService.showBalances();

        acc1.applyInterest();
        acc2.applyInterest();

        System.out.println("After interest:");
        bankService.showBalances();
    }
}
