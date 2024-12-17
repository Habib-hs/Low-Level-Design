package StructuralDesignPattern.Decorator;

class Discount {
    private FoodOrder order;

    public Discount(FoodOrder order) {
        this.order = order;
    }

    public String getDescription() {
        return order.getDescription() + " + Discount Applied";
    }

    public double getCost() {
        return order.getCost() - 3.0; // Apply discount
    }
}
