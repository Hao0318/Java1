package OOP.Method;

import java.util.Scanner;

public class SmallestNumber {

    public static int getSmallNum (int a, int b, int c) {

        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        System.out.println("The smallest number is " + a);
        return a;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        getSmallNum(a,b,c);
    }
}
