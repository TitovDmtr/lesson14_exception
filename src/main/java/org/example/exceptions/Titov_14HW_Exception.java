package org.example.exceptions;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Titov_14HW_Exception {
    public static void main(String[] args) throws InvalidInputException, EmptyStackException, IndexOutOfBoundException {
        Scanner in = new Scanner(System.in);

        System.out.print("Please type your Login: ");
        String typelogin = in.nextLine();
        System.out.print("Please type your Password: ");
        String typePass = in.nextLine();

        if (typelogin.isEmpty() || typePass.isEmpty()) {
            throw new NullPointerException("EmptyStackException: Login and password must be not empty. Pls try again");
        }
        if (typePass.length() < 6) {
            throw new IndexOutOfBoundException("IndexOutOfBoundException: Pass must be no less then 6 symbols");
        }

        String res = authentication(typelogin, typePass);
        System.out.println(res);
        System.exit(0);

    }

    private static String authentication(String typelogin, String typePass) throws InvalidInputException {
        String login = "login1";
        String password = "passwd";
        String res = "";

        if (typelogin.equals(login) && typePass.equals(password)) {
            res = "Вхід в систему успішно виконаний";
        } else {
            throw new InvalidInputException("InvalidInputException: Combination of your log/pass is incorrect");
        }
        return res;
    }

    public static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    private static class IndexOutOfBoundException extends Throwable {
        public IndexOutOfBoundException(String message) {
            super(message);
        }
    }
}