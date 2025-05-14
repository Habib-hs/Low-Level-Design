package DesignPractise.ATMBooth;

class TransactionFactory {
    public static TransactionStrategy getTransaction(TransactionType type) {
        switch(type) {
            case WITHDRAW: return new WithdrawTransaction();
            case CHECK_BALANCE: return new CheckBalanceTransaction();
            default: throw new IllegalArgumentException("Unsupported Transaction Type");
        }
    }
}