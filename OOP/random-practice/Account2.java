import java.util.Scanner;

public class Account2 {
    private double balance = 0;

    public void deposit() {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter how much you want to deposit: ");
        double amount = scanf.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
        scanf.close();
    }

    public void withdraw() {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter how much you want to withdraw: ");
        double amount = scanf.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        }
        scanf.close();
    }

    public double getBalance() {
        return balance;
    }
}