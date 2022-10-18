package com.bridgelab.day4;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.print("Enter the Alphabet to check Vowel or Consonant :: ");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        String temp = ch.toLowerCase();
        switch (temp){
             case "a","e","i","o","u","s" -> System.out.println("Enter Alphabet " + ch + " is Vowel.");
            default -> System.out.println("Enter Alphabet " + ch + " is Consonant.");
        }
    }
}
