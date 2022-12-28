package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Amount");
        int amount = scanner.nextInt();
        int notes;
        if (amount >= 1000) {
            notes = amount / 1000;
            System.out.println("Number Of 1000 notes" +notes);
            amount = amount % 1000;
        }
        if (amount >= 500) {
            notes = amount / 500;
            System.out.println("Number of 500 notes" +notes);
            amount %= 500;
        }
        if (amount >= 100) {
            notes = amount / 100;
            System.out.println("Number of 100 notes" +notes);
            amount %= 100;
        }
        if (amount >= 50) {
            notes = amount / 50;
            System.out.println("Number of 50 notes" +notes);
            amount %= 50;
        }
        if (amount >= 10) {
            notes = amount / 10;
            System.out.println("Number of 10 notes" +notes);
            amount %= 10;
        }
        if (amount >= 2) {
            notes = amount / 2;
            System.out.println("Number of 2 notes" +notes);
            amount %= 2;
        }
        if (amount >= 1) {
            notes = amount / 1;
            System.out.println("Number of 1 notes" + notes);
        }

    }
}
