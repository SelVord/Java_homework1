import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    // Constructor for PersonalAccount class

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<Amount>();
    }

    // Code to add deposit to account

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
        }
    }

    // Code to withdraw money from account

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        } else {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
    }

    // Code shows all account history

    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println("Transaction Type: " + transaction.getTransactionType());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println();
        }
    }

    // These codes allow to show proper data

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}