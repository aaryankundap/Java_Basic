public class BankAccount {
    // Private field to store balance
    private double balance;

    // Constructor (optional)
    public BankAccount() {
        balance = 0.0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }
}
