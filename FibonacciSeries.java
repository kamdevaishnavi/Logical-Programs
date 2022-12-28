package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Lenght Of Series");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++){
           int n3 = n1 + n2;
            System.out.println("" + n1);
//            n1 = n2;
//            n2 = n3;

        }
    }
}
