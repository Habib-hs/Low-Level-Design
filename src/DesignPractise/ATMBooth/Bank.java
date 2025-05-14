package DesignPractise.ATMBooth;

class Bank {
    private static Bank instance = new Bank();
    private Bank() {}
    public static Bank getInstance() { return instance; }

    public boolean validateTransaction(Card card, TransactionType type, double amount) {
        // Dummy logic
        return true;
    }

    public void updateBalance(Card card, double amount) {
        System.out.println("Balance updated for card: " + card.getCardNumber());
    }
}
