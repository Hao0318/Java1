package StatementControl.Test;

import java.util.Scanner;

/*
Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row. The pattern is as follows
1
22
333
4444
 */
public class Test23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of rows :");

        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
