package db;

import java.sql.*;


/**
 *
 * @author IVb
 */
public class DBConnection {
    
    public final static String DB_URL = "vladDB.db";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:"+DB_URL);
    }
    
}
