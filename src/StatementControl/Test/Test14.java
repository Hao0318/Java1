package StatementControl.Test;
/*
Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
 */

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

        System.out.println("Provide a single character from the alphabet,please.");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        char ch = str.charAt(0);

        int i = (int) ch;

        if (str.length() > 1) {
            System.out.println("Error Message");
        }else if ((i > 64 && i < 91) || (i > 96 && i < 123)){

            if (i == 65 || i == 69 || i == 73 || i == 79 || i == 85 || i == 97 || i == 101 || i ==105 || i == 111 || i == 117){
                    System.out.println("Input letter is Vowel");

            }else {
                    System.out.println("Input letter is Consonant");
            }
        }else {
            System.out.println("Error Message");
        }

    }
}
