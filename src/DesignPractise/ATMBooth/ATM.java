package DesignPractise.ATMBooth;

// ATM CLASS
class ATM {
    private String atmId;
    private double availableCash;

    public ATM(String atmId, double availableCash) {
        this.atmId = atmId;
        this.availableCash = availableCash;
    }

    public boolean verifyCard(Card card) {
        return card != null;
    }

    public boolean verifyPin(Card card, int pin) {
        return card.validatePin(pin);
    }

    public void dispenseCash(double amount) {
        if (availableCash >= amount) {
            availableCash -= amount;
            System.out.println("Dispensed: $" + amount);
        } else {
            System.out.println("Insufficient cash in ATM");
        }
    }

    public void printReceipt(Receipt receipt) {
        System.out.println("Receipt printed for: " + receipt);
    }
}
