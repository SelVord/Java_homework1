public class Amount {
    private double amount;
    private String transactionType;

    // Constructor for Amount class

    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    // These codes allow to show proper data

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
