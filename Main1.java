  public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Deposit operation
        account.deposit(1000);
        System.out.println("Current Balance: ₹" + account.getBalance());

        // Withdraw operation
        account.withdraw(500);
        System.out.println("Current Balance: ₹" + account.getBalance());

        // Invalid withdraw (exceeds balance)
        account.withdraw(600);
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
