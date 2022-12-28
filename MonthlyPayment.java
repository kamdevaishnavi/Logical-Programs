package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        double P = scanner.nextInt();
        double Y = scanner.nextInt();
        double R = scanner.nextInt();
        double n = 12 * Y;
        double r = R / (12 * 100) ;
        double payment = (P * r) / (1 -Math.pow ((1 + r) , (-n)));
        System.out.println(payment);
    }

}
