package com.bridgelab.day2;

import java.util.Scanner;

public class OperatorProgramQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a value :: ");
        double a = sc.nextDouble();
        System.out.print("Enter the b value :: ");
        double b = sc.nextDouble();
        System.out.print("Enter the c value :: ");
        double c = sc.nextDouble();

        double root1, root2;

        // calculate the delta (b2 - 4ac)
        double delta = b * b - 4 * a * c;

        // check if delta is greater than 0
        if (delta > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if delta is equal to 0
        else if (delta == 0) {

            // two real and equal roots
            // delta is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if delta is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }

}
