package DesignPractise.ATMBooth;

class CheckBalanceTransaction implements TransactionStrategy {
    public void performTransaction(Card card, ATM atm) {
        // Simulated Balance Check
        System.out.println("Your balance is: $1000");
        atm.printReceipt(new Receipt("TX124", 0, TransactionType.CHECK_BALANCE));
    }
}
