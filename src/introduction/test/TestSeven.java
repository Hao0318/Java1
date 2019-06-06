package introduction.test;

import java.util.Scanner;

public class TestSeven {

    public static void main(String[] args) {

        int a;
        int b;


        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        b = a * b;
        a = b / a;
        b = b / a;




        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
