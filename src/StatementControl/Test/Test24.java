package StatementControl.Test;

import java.util.Scanner;

/*
Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like
1
2 3
4 5 6
7 8 9 10
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int i = 0;
        int j = 1;


        while (j <= num) {

            i += 1;
            int k = 1;

            while (k <= i) {
                System.out.print(j + " ");
                j += 1;
                k += 1;
            }
            System.out.println(" ");
        }
    }
}
