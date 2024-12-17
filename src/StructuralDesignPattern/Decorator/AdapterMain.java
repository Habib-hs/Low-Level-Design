package StructuralDesignPattern.Decorator;

public class AdapterMain {
    public static void main(String[] args) {
        // Start with a basic food order
        FoodOrder basicOrder = new FoodOrder();
        System.out.println("Base Order:");
        System.out.println("Description: " + basicOrder.getDescription());
        System.out.println("Cost: $" + basicOrder.getCost());
        System.out.println();

        // Add Gift Wrapping
        GiftWrap giftWrappedOrder = new GiftWrap(basicOrder);
        System.out.println("After Gift Wrapping:");
        System.out.println("Description: " + giftWrappedOrder.getDescription());
        System.out.println("Cost: $" + giftWrappedOrder.getCost());
        System.out.println();

        // Apply Discount
        Discount discountedOrder = new Discount(basicOrder);
        System.out.println("After Applying Discount:");
        System.out.println("Description: " + discountedOrder.getDescription());
        System.out.println("Cost: $" + discountedOrder.getCost());
    }
}
