package StatementControl.Test;

import java.util.Scanner;

/*
Write a Java program to solve quadratic equations (use if, else if and else).
Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
 */
public class TestSeven {

    public static void main(String[] args) {

        System.out.println("Please enter the three parameters of a quadratic equation: ");

        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        double judgeCon = b * b - 4 * a * c;

        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            if ( b == 0){
                System.out.println("There is no solution!");
            }else {
                x1 = -c / b;
                System.out.println("This equation has one single root : x =" + x1);
            }
        }else if (judgeCon < 0) {
            System.out.println("This equation has no real root.");
        }else if (judgeCon == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
            System.out.println("This equation has two equal roots: x1 = " + x1 + " x2 = " + x2);
        }else {
            x1 = (-b  + Math.sqrt(judgeCon)) / ( 2 * a);
            x2 = (-b  - Math.sqrt(judgeCon)) / ( 2 * a);
            System.out.println("This equation has two different roots: x1 = " + x1 + " x2 = " + x2);
        }
    }
}
