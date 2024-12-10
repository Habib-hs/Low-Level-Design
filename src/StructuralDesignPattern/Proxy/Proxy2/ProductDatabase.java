package StructuralDesignPattern.Proxy.Proxy2;

public class ProductDatabase implements ProductDatabaseOperations{

    public ProductDatabase(){
            // Simulate an expensive initialization
            System.out.println("Expensive Database connection established...");
    }

    @Override
    public String fetchProduct(Integer productId) {
        System.out.println("Fetching product details from the database for product ID: " + productId);
        // Simulate fetching product details
        return "Product details for product ID: " + productId;
    }
}
