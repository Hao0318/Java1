package introduction;

public class VariableProperWay {
    // this is global variable
    static int numOne;

    public static void main(String[] args) {

        numOne = 20;
        System.out.println(numOne);

        // Local variables
        int numTwo = 50;
        System.out.println(numTwo);
        getNumber();

    }

    public static void getNumber(){

        //Local variable
        int numThree = 99;
        System.out.println(numThree);

        numOne = 40;
        System.out.println(numOne);
    }
}
