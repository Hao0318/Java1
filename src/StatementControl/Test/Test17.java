package StatementControl.Test;

/*
Write a program in Java to display n terms of natural numbers and their sum.
 */

import java.util.Scanner;

public class Test17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sum = 0;

        if (num <= 0) {
            System.out.println("Input a natural number please");
        }

        System.out.println("The first n natural numbers are:");

        for (int i = 1; i < num + 1; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The Sum of Natural Number up to n terms:");
        System.out.println(sum);
    }
}
