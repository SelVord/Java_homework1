public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(666, "Aktilek Temirov");

        account.deposit(650000);
        account.withdraw(35000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());

        System.out.println("Transaction History:");
        account.printTransactionHistory();
    }
}