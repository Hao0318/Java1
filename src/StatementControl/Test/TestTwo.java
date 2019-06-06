package StatementControl.Test;
/*
Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */

import java.util.Scanner;

public class TestTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the number in inches: ");

        double inches = scan.nextInt();

        double meters = inches * 0.0254;

        System.out.println("The result in meters is : " + meters);

    }
}
