package StatementControl.Test;

import java.util.Scanner;

/*
Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 */
public class Test18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input 5 numbers please.");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();

        double sum, average;

        sum = num1 + num2 + num3 + num4 + num5;
        average = sum / 5;

        System.out.println("The sum of these 5 numbers is " + sum);
        System.out.println("The average of these 5 numbers is " + average);
    }
}
