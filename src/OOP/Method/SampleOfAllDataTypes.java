package OOP.Method;

public class SampleOfAllDataTypes {
    //Method with return type of all data types
    // You need to call that method from main method
    // You can choose to keep the method static or non-static

    public static int intType() {
        System.out.println(10);
        return 10;
    }

    public  static byte byteType() {
        System.out.println(1);
        return  1;
    }

    public  static short shortType() {
        System.out.println(11);
        return  11;

    }

    public static long longType() {
        System.out.println(100000000);
        return 100000000;
    }

    public static float floatType() {
        System.out.println(1.234);
        return 1.234f;
    }

    public static double doubleType() {
        System.out.println(1.23456789012345);
        return 1.23456789012345;
    }

    public static boolean booleanType() {
        System.out.println("True");
        return true;
    }

    public static char charType() {
        System.out.println('A');
        return 'A';
    }

    public static void main(String[] args) {
        byteType();
        shortType();
        longType();
        intType();
        booleanType();
        charType();
        floatType();
        doubleType();
    }
}
