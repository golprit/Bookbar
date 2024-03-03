package bookbar.com.entity;

public class userInfo {

    private int id;
    private String userName;
    private String email;
    private String password;
    private String date;
    
    
    public userInfo(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public userInfo(int id, String userName, String email, String password, String date) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.date = date;
    }

    public userInfo() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
