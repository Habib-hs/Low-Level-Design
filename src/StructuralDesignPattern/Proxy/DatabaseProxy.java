package StructuralDesignPattern.Proxy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseProxy {
    private Database realDatabase;
    private Map<String ,String> cache = new HashMap<>();

    public String fetchData(String query){
        // Check if the result is in the cache
        if(cache.containsKey(query)){
            System.out.println("Returning cached result for query: " + query);
            return cache.get(query);
        }else{   // Initialize the real database if not already done
            System.out.println("Initializing Database lazily...");
            realDatabase = new Database();
        }

        // Fetch data from the real database
        String result = realDatabase.fetchData(query);

        // Cache the result for future use
        cache.put(query, result);
        return result;
    }
}
