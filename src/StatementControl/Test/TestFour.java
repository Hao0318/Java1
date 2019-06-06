package StatementControl.Test;
/*
Write a Java program to convert minutes into a number of years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
 */
import java.util.Scanner;

public class TestFour {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minutes = scan.nextInt();

        int years = minutes / 60 / 24 / 365;

        int days;

        if ((years / 4) >= 1) {

            int addDay = years / 4;

            days = (minutes - years * (60 * 24 * 365)) / (60 * 24) - addDay;
        }else {

            days = (minutes - years * (60 * 24 * 365)) / (60 * 24);
        }


        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days.");
    }
}
