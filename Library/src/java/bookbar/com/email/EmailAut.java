
package bookbar.com.email;

public class EmailAut {
    
    public static String otpGen(){
    
    String otp ;
    
    int randomno =  (int) (Math.random()*9000);
    otp = String.valueOf(randomno);
    return otp;
    }
    
    public static void main(String[] args){
    
        System.out.println(otpGen());
    }
    
}
