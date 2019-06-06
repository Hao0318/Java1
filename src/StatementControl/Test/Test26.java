package StatementControl.Test;

import java.util.Scanner;

/*
Write a program in Java to print the Floyd's Triangle.
Test Data
Input number of rows : 5
Expected Output :
1
01
101
0101
10101
 */
public class Test26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of rows : ");

        int num = scan.nextInt();

        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j)%2);
                }
            System.out.println("");
            }

        }
    }

