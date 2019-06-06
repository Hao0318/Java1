package StatementControl.Exception;

import java.io.File;

public class MyExceptionDemo {
    public static void main(String[] args) {

        try{
            System.out.println("Starting try block");
            throw new MyException("This is exception");
        }catch (MyException exp) {
            System.out.println("Catch block");
            System.out.println(exp);
        }
    }
}

class MyException extends Exception {

    MyException (String str) {
        super(str);
    }
}