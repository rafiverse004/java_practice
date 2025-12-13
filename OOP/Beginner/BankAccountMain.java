/*
PROBLEM 2:
Create a BankAccount class with:
- private balance field
- deposit and withdraw methods
- validation to prevent invalid operations
*/

// WHAT YOU ARE LEARNING:
// Encapsulation, Data Validation, Method Logic

class BankAccount {

    // Private field → balance cannot be modified directly
    private double balance;

    // Constructor → initial balance must be valid
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Deposit method → adds money after validation
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    // Withdraw method → prevents overdraft
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal");
        }
        balance -= amount;
    }

    // Getter → read-only access to balance
    public double getBalance() {
        return balance;
    }
}

// Main class comes last
public class BankAccountMain {

    public static void main(String[] args) {

        // Create account with valid initial balance
        BankAccount account = new BankAccount(1000);

        // Perform operations
        account.deposit(500);
        account.withdraw(300);

        // Check balance
        System.out.println(account.getBalance());
    }
}
