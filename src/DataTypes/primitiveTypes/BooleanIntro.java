package DataTypes.primitiveTypes;

public class BooleanIntro {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = (10 > 2) ? true: false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean b;

        b = false;
        System.out.println(b);

        if ( 10 > 20){

            System.out.println("This is working");
        }else {
            System.out.println("Something else");

            //Wrapper class
            Boolean boo = Boolean.valueOf("true");
            System.out.println(boo);

            String strBoolean = "TRUE";

            boolean theValue = Boolean.parseBoolean(strBoolean);
            System.out.println(theValue);
        }

    }
}
