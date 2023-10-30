package org.example.notes.exceptions.login_password;

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            boolean result = checkCredentials("loginexample", "passwordexample", "passwordexample");
            System.out.println("Учетные данные верны: " + result);
        } catch (WrongLoginException e) {
            System.out.println("Некорректный логин: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Некорректный пароль: " + e.getMessage());
        }
    }

    public static boolean checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Длина логина должна быть менее 20 символов.");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть менее 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать.");
        }

        return true;
    }
}
