package BehavioralDesignPatterns.Strategy;

class ExpressShipping implements ShippingCostStrategy {
    public double calculateShippingCost(double weight) {
        return weight * 2.0;  // Cost calculation for express shipping
    }
}
