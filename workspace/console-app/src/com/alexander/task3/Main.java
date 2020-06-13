package com.alexander.task3;

public class Main {
    public static void main(String[] args) {
        RandomNumbersService service = new RandomNumbersService();
        service.printRandomArrayRow(args);
        service.printRandomArrayColumn(args);
    }
}
