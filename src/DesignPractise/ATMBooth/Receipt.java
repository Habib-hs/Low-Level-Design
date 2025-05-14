package DesignPractise.ATMBooth;


class Receipt {
    private String transactionId;
    private double amount;
    private TransactionType type;

    public Receipt(String transactionId, double amount, TransactionType type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
    }
}
