package com.bridgelab.day4;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a ::: ");
        int a = sc.nextInt();
        System.out.print("Enter the value for b ::: ");
        int b = sc.nextInt();
        int temp = 0;
        System.out.println("Before Swapping the values of a "+a+" and b "+b);
        //Swapping the both numbers...
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping the values a "+a+" and b "+b);
    }
}
