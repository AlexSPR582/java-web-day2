package com.alexander.task2;

public class CmdArgsService {
    public void reverseArguments(String[] args) {
        int index = args.length - 1;
        while (index >= 0) {
            System.out.print(args[index] + " ");
            index--;
        }
    }
}
