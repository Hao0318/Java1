package introduction;

public class VariableTypes {
            /*

        1. Local Variable
        2. Static (or class) Variable
        3. Instance variable

         */

    public String myString = "Class or Static variable";

    public static void main(String[] args) {


        VariableTypes objOne = new VariableTypes();
        System.out.println(objOne.myString);

        VariableTypes objTwo = new VariableTypes();
        System.out.println(objTwo.myString);
    }
}
