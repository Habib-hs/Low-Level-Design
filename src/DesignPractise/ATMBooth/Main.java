package DesignPractise.ATMBooth;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM("ATM-101", 5000);
        Card card = new Card("1234-5678-9876-5432", 1234);
        Customer customer = new Customer("Abdullah", card);

        if (customer.insertCard(atm) && customer.enterPin(atm, 1234)) {
            customer.performTransaction(atm, TransactionType.WITHDRAW);
            customer.performTransaction(atm, TransactionType.CHECK_BALANCE);
        } else {
            System.out.println("Authentication failed");
        }
    }
}
