package lection_2;

public class User {
    public static boolean regUser(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.matches("^[a-zA-Z0-9_]+$") || login.length() >= 20) {
            throw new WrongLoginException("Неверный логин. Допустимы только латинские буквы, цифры и знак подчеркивания. Длина не должна превышать 20 символов.");
        }
    }

    private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.matches("^[a-zA-Z0-9_]+$") || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль. Допустимы только латинские буквы, цифры и знак подчеркивания. Длина не должна превышать 20 символов. Пароли должны совпадать.");
        }
    }
}
