package com.bridgelab.day2;

import java.util.Scanner;

import static java.lang.System.*;

public class SwitchVowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.print("Enter the letter :: ");
        char ch = sc.next().charAt(0);
        char x = Character.toLowerCase(ch);
        switch (x) {
            case 'a', 'e', 'i', 'o', 'u' -> out.println("Enter letter is Vowel " + ch);
            default -> out.println("Enter letter is Consonant " + ch);
        }
    }
}
