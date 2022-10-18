package com.bridgelab.day4;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a ::: ");
        int a = sc.nextInt();
        System.out.print("Enter the value for b ::: ");
        int b = sc.nextInt();
        double quotient = a / b;
        int remainder = a % b;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
