package StatementControl.Test;
/*
Write a Java program to find the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
 */

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {

        System.out.println("Enter a month number and a year number: ");
        Scanner scan = new Scanner(System.in);

        int monthNum = scan.nextInt();
        int yearNum = scan.nextInt();

        if (yearNum < 0) {
            System.out.println("Enter a valid year number!");
        }

        switch (monthNum) {
            case 1:
                System.out.print("January " + yearNum + " has 31 days");
                break;
            case 2:
                if (yearNum % 400 == 0 || (yearNum % 100 != 0 && yearNum % 4 == 0)) {
                    System.out.println("February " + yearNum + " has 29 days");
                }else{
                    System.out.println("February " + yearNum + " has 28 days");
                }
                break;
            case 3:
                System.out.println("March " + yearNum + " has 31 days");
                break;
            case 4:
                System.out.println("April " + yearNum + " has 30 days");
                break;
            case 5:
                System.out.println("May " + yearNum + " has 31 days");
                break;
            case 6:
                System.out.println("Jun " + yearNum + " has 30 days");
                break;
            case 7:
                System.out.println("July " + yearNum + " has 31 days");
                break;
            case 8:
                System.out.println("August " + yearNum + " has 31 days");
                break;
            case 9:
                System.out.println("September " + yearNum + " has 30 days");
                break;
            case 10:
                System.out.println("October " + yearNum + " has 31 days");
                break;
            case 11:
                System.out.println("November " + yearNum + " has 30 days");
                break;
            case 12:
                System.out.println("December " + yearNum + " has 31 days");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
