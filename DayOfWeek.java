package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day");
        int day = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        int yn = year - (14 - month) / 12;
        int x = yn + yn / 4 - yn / 100 + yn / 400;
        int mn = month + 12 * ((14 - month) / 12) - 2;
        int dn = (day + x + (31 * mn) / 12) % 7;
        System.out.println("on" + day + "/" + month + "/" + year + "day is");
        switch (dn) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("thusday");
                break;
            case 4:
                System.out.println("friday");
                break;
            case 5:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid");

        }


    }
}
