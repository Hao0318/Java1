package StatementControl.Test;
/*
Write a program in Java to display the n terms of odd natural number and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25
 */

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of terms :");

        int num = scan.nextInt();

        System.out.println("The odd natural numbers are :");

        int sum = 0;
        int oddNum = 1;

        for (int i = 0; i < num; i++) {

            System.out.println(oddNum);

            sum += oddNum;

            oddNum += 2;
        }

        System.out.println("The sum of odd natural number up to " + num + " is : " + sum);
    }
}
