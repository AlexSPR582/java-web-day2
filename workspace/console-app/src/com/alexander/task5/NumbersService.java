package com.alexander.task5;

public class NumbersService {
    public void countSum(String[] args) {
        if (validate(args)) {
            int sum = 0;
            for (String number : args) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        }
    }

    private boolean validate(String[] args) {
        if (args.length == 0) {
            System.out.println("Not enough arguments");
            return false;
        } else {
            try {
                for (String agr : args) {
                    Integer.parseInt(agr);
                }
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect arguments");
                return false;
            }
        }
    }
}
