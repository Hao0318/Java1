package StatementControl.Test;
/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
 */

import java.util.Scanner;

public class TestNine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a floating-point number:");
        double num = scan.nextDouble();

        if (num == 0){
            System.out.println("zero");
        }else if (num > 0) {
            System.out.print("positive");
            if (num < 1) {
                System.out.println(" small");
            }else if (num > 1000000) {
                System.out.println(" large");
            }else {
                System.out.println(" ");
            }
        }else {
            System.out.print("negative");
            if (num > -1) {
                System.out.println(" small");
            }else if (num < -1000000){
                System.out.println(" large");
            }else {
                System.out.println(" ");
            }
        }

    }
}
