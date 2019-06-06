package StatementControl.Exception;

public class Intro {

    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 0;
        Object num = 12.00;
        Object number = "Test";

        try {
            System.out.println(numOne / numTwo);

        }catch (Exception foo) {
            System.out.println("Positive number can be divided by 0");
        }

        System.out.println("Outside of Try catch block");
    }
}
