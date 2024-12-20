package BehavioralDesignPatterns.Strategy;

class OvernightShipping implements ShippingCostStrategy {
    public double calculateShippingCost(double weight) {
        return weight * 3.0;  // Cost calculation for overnight shipping
    }
}