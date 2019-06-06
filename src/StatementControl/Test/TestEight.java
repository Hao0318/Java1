package StatementControl.Test;
/*
Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
 */

import java.util.Scanner;

public class TestEight {
    public static void main(String[] args) {

        System.out.println("Input 3 numbers: ");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < num2) {
            num1 = num2;
        }

        if (num1 < num3) {
            num1 = num3;
        }

        System.out.println("The greatest :" + num1);
    }
}
