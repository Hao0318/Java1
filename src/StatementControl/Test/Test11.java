package StatementControl.Test;

/*
Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
 */
import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {

        System.out.println("Enter a integer between 1 to 7:");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number, please enter a integer between 1 to 7!");
                break;
        }

    }
}
