package StructuralDesignPattern.Proxy.Proxy2;

public class ProxyExampleMain {
    public static void main(String[] args) {
        ProductDatabaseOperations database = new ProductDatabaseProxy(); // Use the proxy

        System.out.println("----------------------------------------------");
        // Fetch product details multiple times
        System.out.println(database.fetchProduct(12)); // First call (cache miss)
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println(database.fetchProduct(12)); // Second call (cache hit)
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println(database.fetchProduct(56)); // Different product (cache miss)
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println(database.fetchProduct(56)); // Same product (cache hit)
    }
}
