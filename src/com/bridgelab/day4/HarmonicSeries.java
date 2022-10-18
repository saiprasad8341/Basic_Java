package com.bridgelab.day4;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.print("Enter the N value :: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double result = 0;

        System.out.print("The Harmonic series is :: ");

        while (N > 0){
            result = result + (double) 1 / N;
            N--;
            System.out.print(result + " , ");
        }
    }
}
