package com.bridgelab.day4;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.print("Enter the power of 2 :: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        //printing the power of 2 (2^N);
        for (int i = 1; i <= N; i++){
            total = (int) Math.pow(2,i);
        }
        System.out.println("Total of 2^"+N+" :::: "+total);
    }
}
