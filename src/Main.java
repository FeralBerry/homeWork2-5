import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        checkAuth("12341234123412341234","1","1");
    }
    public static void checkAuth(String login, String password, String confirmPassword) {
        if(login.length() > 20){
            throw new RuntimeException("WrongLoginException");
        }
        if(isValidPasswordAndLogin(login)){
            throw new RuntimeException("WrongLoginException");
        }
        if(password.length() > 20){
            throw new RuntimeException("WrongPasswordException");
        }
        if(isValidPasswordAndLogin(password)){
            throw new RuntimeException("WrongPasswordException");
        }
        if(!password.equals(confirmPassword)){
            throw new RuntimeException("WrongPasswordException");
        }
    }
    private static boolean isValidPasswordAndLogin(String password) {
        return password.matches("\\w}");
    }
}