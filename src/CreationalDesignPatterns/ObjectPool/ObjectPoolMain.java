package CreationalDesignPatterns.ObjectPool;

import java.sql.Connection;
import java.sql.SQLException;

public class ObjectPoolMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "user";
        String password = "password";

        //create a connectionPool with 5 connections
        ConnectionPool pool = new ConnectionPool(5, url, username , password);

        try{
            // get connection from the poll
            Connection conn = pool.getConnection();
            //database related task i need to do, i will work with that connection.

            //for other task another connection can be need, so after work i will release that connection
            pool.releaseConnection(conn);

        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            pool.closeAllConnection();
        }
    }
}
