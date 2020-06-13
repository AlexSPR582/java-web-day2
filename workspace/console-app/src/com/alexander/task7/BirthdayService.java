package com.alexander.task7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayService {
    public void printBirthdayInfo(String[] args) {
        if (validate(args)) {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int day = Integer.parseInt(args[2]);
            Calendar birthday = new GregorianCalendar(year, month - 1, day - 1);
            System.out.println("full years: "
                    + calculateAge(year, month, day));
            System.out.println("day of week: " + getDayOfWeek(birthday));
            if (isBirthday(birthday)) {
                System.out.println("Happy Birthday");
            }
        }
    }

    private boolean isBirthday(Calendar birthday) {
        Calendar today = new GregorianCalendar();
        return today.equals(birthday);
    }

    private int getDayOfWeek(Calendar birthday) {
        int day = birthday.get(Calendar.DAY_OF_WEEK);
        return day;
    }

    private int calculateAge(int year, int month, int day) {
        Calendar age = new GregorianCalendar();
        age.add(Calendar.YEAR, -year);
        age.add(Calendar.MONTH, -month);
        age.add(Calendar.DAY_OF_MONTH, -day);
        int fullYears = age.get(Calendar.YEAR);
        return fullYears;
    }

    private boolean validate(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid arguments");
            return false;
        } else {
            try {
                Integer.parseInt(args[0]);
                Integer.parseInt(args[1]);
                Integer.parseInt(args[2]);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid arguments");
                return false;
            }
        }
    }
}
