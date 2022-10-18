package com.bridgelab.day4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A value :: ");
        int a = sc.nextInt();
        System.out.print("Enter the B value :: ");
        int b = sc.nextInt();
        System.out.print("Enter the C value :: ");
        int c = sc.nextInt();
        if (a < b && a < c){
            System.out.println("A is bigger " + a);
        } else if (b > a && b > c) {
            System.out.println("B is bigger " +b);
        } else {
            System.out.println("C is bigger "+c);
        }
    }
}
