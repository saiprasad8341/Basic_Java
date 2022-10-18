package com.bridgelab.day4;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for checking Even or Odd ::: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Given number " + n + " is an Even");
        } else {
            System.out.println("Given number " + n + " is an Odd");
        }
    }
}
