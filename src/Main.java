public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(666, "Aktilek Temirov");

        account.deposit(650000);

        try {
            account.withdraw(750000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());

        System.out.println("Transaction History:");
        account.printTransactionHistory();
    }
}