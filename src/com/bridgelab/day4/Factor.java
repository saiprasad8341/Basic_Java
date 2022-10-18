package com.bridgelab.day4;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        System.out.print("Enter the N value :: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print("Factors of " + N + " are ::: ");
        // loop runs from 1 to N
        for (int i = 1; i <= N; i++){
            //if N is divided by i
            // i is the factor
            if (N % i == 0){
                System.out.print(i +" , ");
            }
        }
    }
}
