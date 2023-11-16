import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "1234123411111_";
        String password = "1231gjghfdbk";
        String confirmPassword = "123";
        checkAuth(login,password,confirmPassword);
    }
    private static void checkAuth(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || login.length() == 0) {
                throw new WrongLoginException("Значение не может быть больше 20 и меньше 0");
            }
            if(!isValidPasswordAndLogin(login)){
                throw new WrongLoginException("Логин могут состоять только из латинских букв, цифр и знака _");
            }
            if (password.length() > 20 || password.length() == 0) {
                throw new WrongPasswordException("Значение не может быть больше 20 и меньше 0");
            }
            if(!isValidPasswordAndLogin(password)){
                throw new WrongPasswordException("Пароль могут состоять только из латинских букв, цифр и знака _");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            // если уронить программу
            // throw new RuntimeException(e);
            // если вывести ошибку и продолжить работать
            System.out.println(e);
        }
    }
    private static boolean isValidPasswordAndLogin(String str) {
        return Pattern.matches("^[a-zA-Z0-9_]*$", str);
    }
}