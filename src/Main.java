public class Main {
    public static void main(String[] args) {
        String login = "1234123411111_";
        String password = "1231gjghfdbk";
        String confirmPassword = "123";
        checkAuth(login,password,confirmPassword);
    }
    private static void checkAuth(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                CustomException.isValidPasswordAndLoginLength(login.length());
            }
            CustomException.isValidPasswordAndLogin(login);
        } catch(ArrayIndexOutOfBoundsException | CustomException e){
            System.out.println ("WrongLoginException");
        }
        try{
            if (password.length() > 20) {
                CustomException.isValidPasswordAndLoginLength(password.length());
            }
            CustomException.isValidPasswordAndLogin(password);
            CustomException.equalsPasswordAdnConfirmPassword(password,confirmPassword);
        } catch (ArrayIndexOutOfBoundsException | CustomException e){
            System.out.println ("WrongPasswordException");
        }
    }


}