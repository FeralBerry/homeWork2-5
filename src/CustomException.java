import java.util.regex.Pattern;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
    static void isValidPasswordAndLoginLength(int value) throws CustomException {
        if (value > 20 || value <= 0) {
            throw new CustomException("Значение не может быть больше 20 и меньше 0");
        }
    }
     static void isValidPasswordAndLogin(String str) throws CustomException {
        if (!Pattern.matches("^[a-zA-Z0-9_]*$", str)) {
            throw new CustomException("Логин и пароль могут состоять только из латинских букв, цифр и знака _");
        }
    }
    static void equalsPasswordAdnConfirmPassword(String pass, String confPass) throws CustomException {
        if (!pass.equals(confPass)) {
            throw new CustomException("Пароли не совпадают");
        }
    }

}
