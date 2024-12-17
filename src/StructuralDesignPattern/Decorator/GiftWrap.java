package StructuralDesignPattern.Decorator;

class GiftWrap {
    private FoodOrder order;

    public GiftWrap(FoodOrder order) {
        this.order = order;
    }

    public String getDescription() {
        return order.getDescription() + " + Gift Wrapping";
    }

    public double getCost() {
        return order.getCost() + 2.0; // Add gift wrap cost
    }
}

