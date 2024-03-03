package bookbar.com.helper;

import java.sql.*;

public class DbConnection {

    private static Connection con;

    public static Connection connectionProvider() {

        try {

            if (con == null) {
                //driver lode..
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                //connction string 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookbar", "root", "");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
