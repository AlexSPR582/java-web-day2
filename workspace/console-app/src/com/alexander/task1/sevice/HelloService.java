package com.alexander.task1.sevice;

public class HelloService {
    public void helloUser(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("No user");
        }
    }
}
