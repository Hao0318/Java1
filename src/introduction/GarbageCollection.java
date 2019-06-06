package introduction;

public class GarbageCollection {

    public static void main(String[] args) {
        System.out.println("This is test line");

        int number = 10;

        System.runFinalization();
        System.gc();

        System.out.println(number);
    }


}
