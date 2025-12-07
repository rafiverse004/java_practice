import java.util.Scanner;

public class Account2 {
    private double balance = 0;

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much you want to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}