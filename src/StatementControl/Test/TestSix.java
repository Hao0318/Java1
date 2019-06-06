package StatementControl.Test;
/*
Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive
 */
import java.util.Scanner;

public class TestSix {

    public static void main(String[] args) {

        System.out.println("please enter a number");

        Scanner scan = new Scanner(System.in);

        double num = scan.nextInt();

        if (num > 0){
            System.out.println("the number is positive");

        }else if (num < 0){
            System.out.println("the number is negative");

        }else{
            System.out.println("the number is 0");
        }
    }
}
