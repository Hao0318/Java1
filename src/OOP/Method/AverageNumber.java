package OOP.Method;

    import java.util.Scanner;

    public class AverageNumber {

        public static double getSmallNum (int a, int b, int c) {

           double average = (a + b + c) / 3;

            System.out.println("The average number is " + average);
            return average;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            getSmallNum(a, b, c);
        }
}
