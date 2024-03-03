
package bookbar.com.dao;

import bookbar.com.entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class BookOp {
    
    private Connection con;

    public BookOp(Connection con) {
        this.con = con;
    }
    
    
    public ArrayList<Category> selectCat() {

        String quer = "select * from category";
        ArrayList<Category> list = new ArrayList<Category>();
        try {

            PreparedStatement pr = this.con.prepareStatement(quer);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                Category c = new Category();
                c.setCat(rs.getString("category"));
                c.setId(rs.getInt("id"));
                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
}
