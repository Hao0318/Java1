package StatementControl.Test;
/*
Write a Java program that takes a year from user and print whether that year is a leap year or not.
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year
 */

import java.util.Scanner;

public class Test15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int yearNum = scan.nextInt();

        if (yearNum % 400 == 0 || (yearNum % 100 != 0 && yearNum % 4 == 0)) {
            System.out.println(yearNum + " is a leap year");
        }else {
            System.out.println(yearNum + " is not a leap year");
        }
    }
}
