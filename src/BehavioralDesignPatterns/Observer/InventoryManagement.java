package BehavioralDesignPatterns.Observer;

// Subscriber --> Concrete Observer - Inventory Management System
class InventoryManager implements ProductObserver {
    @Override
    public void update(Product product) {
        System.out.println("Inventory Manager: Added " + product.getName() +
                " to inventory tracking system with initial stock of 0");
    }
}
