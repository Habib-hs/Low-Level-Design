package BehavioralDesignPatterns.Strategy;

//context class

class ShippingCostCalculator {
    private ShippingCostStrategy strategy;

    // Set the strategy dynamically
    public ShippingCostCalculator(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight) {
        return strategy.calculateShippingCost(weight);
    }
}