package StructuralDesignPattern.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        DatabaseProxy proxy = new DatabaseProxy();

        // First time fetching data - no cache, database will initialize lazily
        System.out.println(proxy.fetchData("SELECT * FROM users"));

        // Second time fetching the same data - result will come from the cache
        System.out.println(proxy.fetchData("SELECT * FROM users"));

        // Fetching different data - cache miss, so real database will be queried
        System.out.println(proxy.fetchData("SELECT * FROM orders"));
    }
}
