package DesignPractise.ATMBooth;

class WithdrawTransaction implements TransactionStrategy {
    public void performTransaction(Card card, ATM atm) {
        if (Bank.getInstance().validateTransaction(card, TransactionType.WITHDRAW, 100)) {
            atm.dispenseCash(100);
            Bank.getInstance().updateBalance(card, -100);
            atm.printReceipt(new Receipt("TX123", 100, TransactionType.WITHDRAW));
        }
    }
}