package Singleton;

public class DatabaseConnectionManager {
    // Static variable to hold the single instance
    private static DatabaseConnectionManager instance;

    // Simulating a database connection (could be a Connection object in real scenarios)
    private String connection;


    // Private constructor to prevent instantiation from other classes
    private DatabaseConnectionManager() {
            // Load the PostgreSQL JDBC driver (automatically handled in Java 6+)
            String url = "jdbc:postgresql://localhost:5432/mydatabase";
            String user = "username";
            String password = "password";

            // Establish connection
            connection = "Connected to the Database";
            System.out.println("Database connection established!");
    }

    // Public method to provide access to the single instance
    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Method to get the connection object
    public String getConnection() {
        return connection;
    }
}
