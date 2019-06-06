package StatementControl.Test;
/*
Write a program in Java to display the multiplication table of a given integer.
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
 */

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of terms : ");
        int num = scan.nextInt();

        int i = 0;

        while (i <= num) {
            System.out.println(num + " X " + i + " = " + num * i);
            i++;
        }

    }
}
