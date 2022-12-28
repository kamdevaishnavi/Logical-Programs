package com.bridgelabz.logicalproblems;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
//        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
    }

}


