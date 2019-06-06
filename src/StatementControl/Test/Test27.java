package StatementControl.Test;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a diamond.

 */
public class Test27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the greatest diameter of the diamond: ");
        int diameter = scan.nextInt();

        int high = 2 * diameter - 1;


        for (int i = 0; i < high; i++) {
            for (int j = 0; j < diameter; j++) {
                if (j >= diameter / 2  && j <= diameter / 2 + i) {
                    System.out.print("*0");
                }else {
                    System.out.print("00");
                }
            }
            System.out.println(" ");
        }



    }
}
