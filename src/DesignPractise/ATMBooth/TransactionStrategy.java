package DesignPractise.ATMBooth;

interface TransactionStrategy {
    void performTransaction(Card card, ATM atm);
}
