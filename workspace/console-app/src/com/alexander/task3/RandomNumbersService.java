package com.alexander.task3;

import java.util.Random;

public class RandomNumbersService {
    public void printRandomArrayRow(String[] args) {
        if (validateArgs(args)) {
            int size = Integer.parseInt(args[0]);
            int[] randomArray = createRandomArray(size);
            for (int i = 0; i < randomArray.length; i++) {
                System.out.print(randomArray[i] + " ");
            }
            System.out.println();
        }
    }

    public void printRandomArrayColumn(String[] args) {
        if (validateArgs(args)) {
            int size = Integer.parseInt(args[0]);
            int[] randomArray = createRandomArray(size);
            for (int i = 0; i < randomArray.length; i++) {
                System.out.println(randomArray[i]);
            }
        }
    }

    private int[] createRandomArray(int size) {
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
        }
        return array;
    }

    private boolean validateArgs(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect arguments");
            return false;
        } else {
            try {
                Integer.parseInt(args[0]);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect arguments");
                return false;
            }
        }
    }
}
