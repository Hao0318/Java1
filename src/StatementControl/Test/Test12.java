package StatementControl.Test;
/*
Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
Test Data
Input floating-point number: 1256
Input floating-point another number: 3254
Expected Output :
They are different
 */

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 - num2 < 0.000999999 && num1 - num2 > -0.000999999) {
            System.out.println("They are same");
        }else {
            System.out.println("They are different");
        }
    }
}
