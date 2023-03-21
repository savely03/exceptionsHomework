package homework;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        System.out.println(registration("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9"));
        System.out.println(registration("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_8"));
        System.out.println(registration("java_skypro.godfsdafsdfs", "D_1hWiKjjP_9", "D_1hWiKjjP_8"));
        System.out.println(registration("java_skypro.go", "D_1hWiKjjP_9sdfsdfdsfdsf", "D_1hWiKjjP_8"));
    }

    public static boolean registration(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть не более 20 символов!");

            }
            if (password.length() >= 20) {
                throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}