package StatementControl.Test;

/*
Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius

 */

import java.util.Scanner;

public class TestOne {

    public static void main(String[] args) {

        System.out.println("Please enter the temperature in fahrenheit; ");
        Scanner scan = new Scanner(System.in);

        double fahrnum = scan.nextInt();

        double cels = (fahrnum - 32.0) * 5 / 9;

        System.out.println("The temperature in Celsius degree is :" + cels);

    }
}
