package DesignPractise.ATMBooth;

class Card {
    private String cardNumber;
    private int pin;

    public Card(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
