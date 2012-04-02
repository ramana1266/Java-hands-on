// This example is created by Seokyong Hong

// Usage from command line on key.csc.ncsu.edu:
// see instructions in the FAQ

import java.sql.*;

public class FirstExample {
private static final String jdbcURL = "jdbc:oracle:thin:@ora.csc.ncsu.edu:1523:orcl";

// Put your oracle ID and password here
private static final String user = "vmallad";
private static final String password = "malladi89";

public static void main(String[] args) {
try {
// Loading the driver. This creates an instance of the driver
// and calls the registerDriver method to make Oracle Thin
// driver, at ora.csc.ncsu.edu, available to clients.

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(jdbcURL, user, password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
            
            // Create the CATS table
            statement.executeUpdate("CREATE TABLE CATS (CNAME VARCHAR(20), " +
            "TYPE VARCHAR(30), AGE INTEGER, WEIGHT FLOAT, SEX CHAR(1))");
            
            // Populate the CATS table
            statement.executeUpdate("INSERT INTO CATS VALUES ('Oscar', 'Egyptian Mau'," +
            " 3, 23.4, 'F')");
            statement.executeUpdate("INSERT INTO CATS VALUES ('Max', 'Turkish Van Cats'," +
            " 2, 21.8, 'M')");
            statement.executeUpdate("INSERT INTO CATS VALUES ('Tiger', 'Russian Blue'," +
            " 1, 13.3, 'M')");
            statement.executeUpdate("INSERT INTO CATS VALUES ('Sam', 'Persian Cats'," +
            " 5, 24.3, 'M')");
            statement.executeUpdate("INSERT INTO CATS VALUES ('Simba', 'Americal Bobtail'," +
            " 3, 19.8, 'F')");
            statement.executeUpdate("INSERT INTO CATS VALUES ('Lucy', 'Turkish Angora Cats'," +
            "2, 22.4, 'F')");
            
            // Get records from the CATS table
        result = statement.executeQuery("SELECT CNAME, WEIGHT FROM CATS");
        
        // Now result contains the rows of cat names and weights from
        // the CATS table. To access the data, use the method
        // NEXT to access all rows in result, one row at a time
        while (result.next()) {
            String name = result.getString("CNAME");
            float weight = result.getFloat("WEIGHT");
            System.out.println(name + "  " + weight);
        }
            } finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
}
static void close(Connection connection) {
        if(connection != null) {
            try { 
            connection.close(); 
            } catch(Throwable whatever) {}
        }
    }
    static void close(Statement statement) {
        if(statement != null) {
            try { 
            statement.close(); 
            } catch(Throwable whatever) {}
        }
    }
    static void close(ResultSet result) {
        if(result != null) {
            try { 
            result.close(); 
            } catch(Throwable whatever) {}
        }
    }
}