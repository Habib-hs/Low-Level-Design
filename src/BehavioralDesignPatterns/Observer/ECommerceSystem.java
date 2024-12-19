package BehavioralDesignPatterns.Observer;


public class ECommerceSystem {
    public static void main(String[] args) {
        // Create the product catalog
        ProductCatalog catalog = new ProductCatalog();

        // Create observers
        InventoryManager inventoryManager = new InventoryManager();
        NotificationService notificationService = new NotificationService();
        SearchIndexUpdater searchIndexUpdater = new SearchIndexUpdater();

        // Register observers with the catalog
        catalog.registerObserver(inventoryManager);
        catalog.registerObserver(notificationService);
        catalog.registerObserver(searchIndexUpdater);

        // Add a new product
        System.out.println();
        Product newProduct = new Product("Wireless Headphones", 99.99);
        catalog.addProduct(newProduct);
    }
}