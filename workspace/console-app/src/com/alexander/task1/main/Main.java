package com.alexander.task1.main;

import com.alexander.task1.sevice.HelloService;

public class Main {
    public static void main(String[] args) {
        HelloService service = new HelloService();
        service.helloUser(args);
    }
}
