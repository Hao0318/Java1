package introduction.test;

import java.util.Scanner;

public class TestFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for (int i = 1; i < 11; ++ i){

            System.out.println(a + " * " + i + " = " + a * i );
        }


    }
}
