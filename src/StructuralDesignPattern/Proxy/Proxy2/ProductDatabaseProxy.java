package StructuralDesignPattern.Proxy.Proxy2;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabaseProxy implements ProductDatabaseOperations{

   private ProductDatabase productDB;
   //private Map<Integer,String> cache = new HashMap<>();
   private Map<Integer, String> cache;

    public ProductDatabaseProxy() {
        this.cache = new HashMap<>(); // Initialize the cache
    }

    @Override
    public String fetchProduct(Integer productId) {
      if(cache.containsKey(productId)){
          System.out.println("Returning cached product details for product ID: " + productId);
          return cache.get(productId);
      }

        // Lazy initialization of the real database only when needed
        if (productDB == null) {
            productDB = new ProductDatabase();
        }

      // Fetch from the real database and cache the result
        System.out.println("Cache miss. Fetching from the real database.");
      String result = productDB.fetchProduct(productId);
      cache.put(productId, result);
      return result;
    }
}
