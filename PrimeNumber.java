package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number");
        num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
