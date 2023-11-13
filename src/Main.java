import java.io.IOException;
import java.util.regex.Pattern;

public class Main extends IOException {
    public static void main(String[] args) {
        checkAuth("123412341_","","");
    }
    public static void checkAuth(String login, String password, String confirmPassword) {
        char[] loginCharArray = login.toCharArray();
        char[] passwordCharArray = password.toCharArray();
        try {
            if (loginCharArray.length > 20) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if(loginCharArray.length == 0){
                throw new NullPointerException();
            }
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println ("WrongLoginException");
        } finally {
            try {
                if (!isValidPasswordAndLogin(login)) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("WrongLoginException");
            }
        }
        try{
            if (passwordCharArray.length > 20) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if(passwordCharArray.length == 0){
                throw new NullPointerException();
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println ("WrongPasswordException");
        } finally {
            try {
                if (!isValidPasswordAndLogin(password)) {
                    throw new RuntimeException();
                }
                if(!password.equals(confirmPassword)){
                    throw new RuntimeException("WrongPasswordException");
                }
            } catch (RuntimeException e){
                System.out.println ("WrongPasswordException");
            }
        }
    }
    private static boolean isValidPasswordAndLogin(String str) {
        return Pattern.matches("^[a-zA-Z0-9_]*$", str);
    }

}