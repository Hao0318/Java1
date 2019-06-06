package StatementControl.Test;

import java.util.Scanner;

/*
.Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 */
public class TestFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the distance (meters): ");
        double distance = scan.nextInt();

        System.out.println("Please enter the time was taken (hour,minute,second): ");
        double hour = scan.nextInt();
        double minute = scan.nextInt();
        double second = scan.nextInt();

        double timeHour, timeMinute, timeSecond, distanKm, distanceMil;

        timeHour = hour + minute / 60 + second / 3600;
       // timeMinute = hour * 60 + minute + second / 60;
        timeSecond = hour * 3600 + minute * 60 + second;
        distanKm = distance / 1000;
        distanceMil = distance / 1609;

        double speedInMperS, speedInKmperH, speedInMilperH;

        speedInMperS = distance / timeSecond;
        speedInKmperH = distanKm / timeHour;
        speedInMilperH = distanceMil / timeHour;

        System.out.println("Your speed in meters/second is " + speedInMperS);
        System.out.println("Your speed in km/h is " + speedInKmperH);
        System.out.println("Your speed in miles/h is " + speedInMilperH);



    }
}
