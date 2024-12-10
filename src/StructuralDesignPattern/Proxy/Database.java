package StructuralDesignPattern.Proxy;

public class Database {
    public Database(){
        // Simulate an expensive initialization
        System.out.println("Expensive Database initialization...");
    }

    public String fetchData(String query){
        // Simulate an expensive operation
        System.out.println("Fetching data for query: " + query);
        return "Result for query: " + query;
    }
}
