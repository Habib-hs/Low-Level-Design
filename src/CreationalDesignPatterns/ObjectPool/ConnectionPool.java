package CreationalDesignPatterns.ObjectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<Connection> connectionPool;
    private final int poolSize;
    private final String url ;
    private final String username;
    private final String password;

    public ConnectionPool (int poolSize, String url, String username, String password){
        this.poolSize = poolSize;
        this.url = url;
        this.username = username;
        this.password = password;
        initialize();
    }

    private void initialize(){
        try{
          connectionPool = new ArrayList<>();
          for(int i = 0 ;i<poolSize; i++){
              Connection conn = DriverManager.getConnection(url, username, password);
              connectionPool.add(conn);
          }
        }catch(SQLException e){
            throw new RuntimeException("Error initializing connection pool", e);
        }
    }

    public synchronized Connection getConnection() throws SQLException{
        if (connectionPool.isEmpty()) {
            throw new SQLException("No available connections in the pool");
        }
        return connectionPool.remove(connectionPool.size() - 1);
    }


    public synchronized void releaseConnection(Connection connection) {
        if (connection != null) {
            connectionPool.add(connection);
        }
    }

    public synchronized void closeAllConnection(){
        for (Connection connection : connectionPool) {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                // Log the error but continue closing other connections
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
        connectionPool.clear();
    }

    public int getAvailableConnections() {
        return connectionPool.size();
    }

}
