package com.SOLID.SRP.employee;

import java.sql.*;

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();

    public DatabaseConnectionManager() {
    }

    public void connection() throws SQLException{
        Connection connection= DriverManager.getConnection("Database URL");
        System.out.println("connection to DB is established");
    }
    public Connection getConnection(){
        return connection;}

    public  void closeConnection(Connection connection) throws SQLException {
        connection.close();
        System.out.println("Connection to DB is closed");
    }
}
