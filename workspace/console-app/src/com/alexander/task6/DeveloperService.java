package com.alexander.task6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DeveloperService {
    public void printSurnameAndDeadLine(String[] args) {
        if (validate(args)) {
            String surname = args[0];
            int days = Integer.parseInt(args[1]);
            Calendar deadLine = calculateDeadLine(days);
            System.out.println(surname + " " + deadLine.getTime());
        }
    }

    private Calendar calculateDeadLine(int days) {
        Calendar deadLine = new GregorianCalendar();
        deadLine.add(Calendar.DAY_OF_MONTH, 30);
        return deadLine;
    }

    private boolean validate(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid arguments");
            return false;
        } else {
            try {
                Integer.parseInt(args[1]);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid arguments");
                return false;
            }
        }
    }
}
