/*
PROBLEM 23:
Modify BankAccount to be thread-safe using synchronized
*/

// WHAT YOU ARE LEARNING:
// Thread-safe OOP, Synchronization, Concurrency-safe Encapsulation

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Negative balance");
        this.balance = initialBalance;
    }

    // Deposit method → synchronized to prevent race conditions
    public synchronized void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit");
        balance += amount;
    }

    // Withdraw method → synchronized
    public synchronized void withdraw(double amount) {
        if (amount <= 0 || amount > balance) throw new IllegalArgumentException("Invalid withdrawal");
        balance -= amount;
    }

    public synchronized double getBalance() {
        return balance;
    }
}

// Main class comes last
public class ThreadSafeMain {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(1000);

        // Two threads depositing simultaneously
        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.deposit(700));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance()); // Should be 2200
    }
}
