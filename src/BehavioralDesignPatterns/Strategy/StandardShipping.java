package BehavioralDesignPatterns.Strategy;

class StandardShipping implements ShippingCostStrategy {
    public double calculateShippingCost(double weight) {
        return weight * 1.5;  // Cost calculation for standard shipping
    }
}