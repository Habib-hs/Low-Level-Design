package BehavioralDesignPatterns.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        // Choosing the shipping method dynamically
        ShippingCostCalculator calculator = new ShippingCostCalculator(new StandardShipping());

        double weight = 10.0; // Example weight of the package
        System.out.println("Standard Shipping Cost: " + calculator.calculateShippingCost(weight));

        // Changing the strategy at runtime
        calculator.setStrategy(new ExpressShipping());
        System.out.println("Express Shipping Cost: " + calculator.calculateShippingCost(weight));

        calculator.setStrategy(new OvernightShipping());
        System.out.println("Overnight Shipping Cost: " + calculator.calculateShippingCost(weight));
    }
}
