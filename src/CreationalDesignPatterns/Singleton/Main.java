package CreationalDesignPatterns.Singleton;

public class Main{
    public static void main(String[] args) {
        // Get the Singleton instance of the DatabaseConnectionManager
       Singleton.DatabaseConnectionManager dbManager1 = Singleton.DatabaseConnectionManager.getInstance();
       Singleton.DatabaseConnectionManager dbManager2 = Singleton.DatabaseConnectionManager.getInstance();

        // Fetch the connection from both instances
        String connection1 = dbManager1.getConnection();
        String connection2 = dbManager2.getConnection();

        // Verify that both references point to the same instance
        System.out.println("Are the connections the same? " + (connection1 == connection2));
    }
}
