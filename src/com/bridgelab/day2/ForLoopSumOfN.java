package com.bridgelab.day2;

import java.util.Scanner;

public class ForLoopSumOfN {
    public static void main(String[] args) {
        System.out.print("Enter the n value :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++ ){
            sum += i;
        }
        System.out.println("Sum of n natural numbers is :: " + sum);
    }
}
