package db;

import java.sql.*;


/**
 *
 * @author IVb
 */
public class DBConnection {
    
    public final static String DB_URL = "vladDB.db";
    public final static String CONNECTION_STRING = "jdbc:sqlite:"+DB_URL;
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONNECTION_STRING);
    }
    
}
