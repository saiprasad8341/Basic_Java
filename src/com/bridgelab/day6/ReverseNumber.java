package com.bridgelab.day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n /10;
        }
        System.out.println("The reverse of the given number is :: " + rev);
    }
}
