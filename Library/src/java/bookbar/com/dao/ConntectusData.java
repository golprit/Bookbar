package bookbar.com.dao;

import bookbar.com.entity.ContactUs;
import bookbar.com.servlet.Contact;
import java.sql.*;

public class ConntectusData {

    Connection con;

    public ConntectusData(Connection con) {
        this.con = con;
    }

    public boolean dataSubmit(ContactUs ct) {
        boolean toogle = false;
        String query = "insert into contactus(name,email,massage) values(?,?,?) ";
        try {

             PreparedStatement pr = (PreparedStatement) this.con.prepareStatement(query);
             pr.setString(1,ct.getName());
             pr.setString(2,ct.getEmail());
             pr.setString(3,ct.getMessage());
             pr.executeUpdate();
             toogle = true ; 
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toogle;
    }

}
