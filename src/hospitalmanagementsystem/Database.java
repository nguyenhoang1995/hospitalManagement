/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS 10
 */
public class Database {

    public static Connection connectDB() {

        try {
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Replace "HOANG\SA" with your server name, and "sa" and "1" with your login and password
            String serverName = "HOANG\\SA";
            String login = "sa";
            String password = "1";

            // Establish the connection
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://" + serverName + ";databaseName=hospitalmanagement", login, password);
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
