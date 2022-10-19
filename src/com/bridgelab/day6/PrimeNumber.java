package com.bridgelab.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        System.out.print("Enter the number need to check prime or not :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++){
            if(n % i == 0)
                count++;
        }
        if(count == 0){
            System.out.println(n+" is an prime number");
        } else {
            System.out.println(n+ " is not a prime number");
        }
    }
}
