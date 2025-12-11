// Create a simple BankAccount with deposit/withdraw and balance validation.
import java.util.Scanner;

class Account {
    int accountNumber;
    double balance;
    String accountHolderName;

    // Constructor with number and name and balance.
    Account(int accountNumber, double balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    // Constructor with number and name.
    Account(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
    // To deposit money.
    void deposit(double balance){
        this.balance += balance;
    }
    // If we deposit without an amoun this will just increase balance 100taka.
    void deposit(){
        this.balance += 100.0;
    }
    // To withdraw money.
    void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    void withdraw(){
        if(100 <= this.balance){
            this.balance -= 100;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    // To display account status.
    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + this.balance + " taka.");
        System.out.println();
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Account acc1 = new Account(242400040, 10000, "Rafik");
        Account acc2 = new Account(0, null);

        // Display to see initial state of two account.
        acc1.display();
        acc2.display();

        // Give name and id to account 2.
        acc2.accountHolderName = "Rafik2";
        acc2.accountNumber = 242400041;
        acc2.display();

        // Give balance to account 2.
        acc2.balance = 50000;
        acc2.display();

        // Without argument inside the deposit will increase balance 100 taka.
        acc1.deposit();
        // With argument inside the deposit will increase balance.
        acc2.deposit(200);
        acc1.display();
        acc2.display();

        // Without argument inside the withdraw will cash out 100tk by default.
        acc1.withdraw();
        // With argument inside the withdraw cash out the ammount.
        acc2.withdraw(25000);
        acc1.display();
        acc2.display();

        scanf.close();
    }
}