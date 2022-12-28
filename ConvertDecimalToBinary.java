package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to convert decimal to binary");
        num = scanner.nextInt();
        int [] binary = new int[10];
        int i = 0;
        while (num > 0) {
            binary[i] = num % 2;
            num /= 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
        System.out.print(binary[j]+" ");
    }
}
}