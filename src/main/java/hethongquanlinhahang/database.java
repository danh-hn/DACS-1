package hethongquanlinhahang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {

    public static Connection connectDB () {

        try {

//            Class.forName("com.mysql.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restaurant", "root", "21122006"); // LINK YOUR DATABASE
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}