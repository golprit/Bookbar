package bookbar.com.dao;

import bookbar.com.entity.userInfo;
import bookbar.com.helper.DbConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public class userData {

    Connection con;

    public userData(Connection con) {
        this.con = con;
    }

    // user enter using this function....
    public boolean userinsert(userInfo ul) {

        boolean toogle = false;

        String query = "insert into userInfo(username,email,password) values(?,?,?) ";

        try {

            PreparedStatement pr = (PreparedStatement) this.con.prepareStatement(query);
            pr.setString(1, ul.getUserName());
            pr.setString(2, ul.getEmail());
            pr.setString(3, ul.getPassword());
            pr.executeUpdate();
            toogle = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return toogle;
    }

    // select user data .....
    public boolean selectUser(userInfo ui) {
        boolean toogle = false;

        String query = "select * from userinfo where email = ? and password = ?";
        
        try {
            PreparedStatement pr = (PreparedStatement) this.con.prepareStatement(query);
            pr.setString(1, ui.getEmail());
            pr.setString(2, ui.getPassword());
            ResultSet rs = pr.executeQuery();
            
            if(rs.next()){
                toogle = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return toogle;
    }

}
