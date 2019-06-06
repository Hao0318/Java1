package StatementControl.Exception;
/*
// you must have three try catch nested block

   /**
    Inside block1
    Exception: e1
    Inside block2
    Arithmetic Exception
    Inside parent try catch block
    Next statement..
 */

public class ExampleFour {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try { b = 10;
            try { b =a * 1;
                try {
                    int num = a / b;

                }catch (ArithmeticException e1) {
                    System.out.println("ArithmeticException is handled in block 3");
                }
            }catch (ArithmeticException e2) {
                System.out.println("ArithmeticException is handled in block 2");
            }
        }catch (ArithmeticException e3) {
            System.out.println("ArithmeticException is handled in main block");
        }
    }
}
