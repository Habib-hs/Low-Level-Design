package DesignPractise.ATMBooth;

class Customer {
    private String name;
    private Card card;

    public Customer(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    public boolean insertCard(ATM atm) {
        return atm.verifyCard(card);
    }

    public boolean enterPin(ATM atm, int pin) {
        return atm.verifyPin(card, pin);
    }

    public void performTransaction(ATM atm, TransactionType type) {
        TransactionStrategy strategy = TransactionFactory.getTransaction(type);
        strategy.performTransaction(card, atm);
    }
}
