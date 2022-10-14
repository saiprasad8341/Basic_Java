package com.bridgelab.day2;

import java.util.Scanner;

public class WhileLoopSumOfN {
    public static void main(String[] args) {
        System.out.print("Enter the n value :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n ){
            sum += i;
            i++;
        }
        System.out.println("Sum of n natural numbers is :: " + sum);
    }
}
