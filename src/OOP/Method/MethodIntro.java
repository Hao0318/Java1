package OOP.Method;

public class MethodIntro {

    /*
    1. Static Method
    2. Non-Static Method
    3. Void Method
    4. Return type Method

    -- All this four type are with args, or without args
     */
    // Access modifier like public, private, protected or default
    // void or have return type
    // method name
    // args
    // body of method

    public static void getInfo() {
        System.out.println("This is method static void method without any args");
    }

    public static int sumOfTwo() {  // need a keyword (int) when return is not void
        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println(c);
        return c;
    }
    public void getInfoWith() {
        System.out.println("This is non-static method without any args");
    }

    public static void main(String[] args) {

        getInfo();
        sumOfTwo();

        MethodIntro intro = new MethodIntro();
        intro.getInfoWith();

        MethodExample.getRef();    // if it is a static method

        MethodExample example = new MethodExample();
        example.getExampleRef();
    }
}

class MethodExample{

    public static void getRef(){
            System.out.println("his is static method from Method Example class");
    }


    public void getExampleRef() {
        System.out.println("This is non-static method from Method Example class");
    }
}
