package com.alexander.task4;

public class PasswordService {
    private final String expectedPassword = "1234";

    public void checkPassword(String[] args) {
        if (args.length > 0) {
            if (expectedPassword.equals(args[0])) {
                System.out.println("Password correct");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Not enough arguments");
        }
    }
}
