package DataTypes.ReferenceDataType;

public class StringIntro {

    public static void main(String[] args) {

        String strOne = "1" + "2";

        System.out.println(strOne);

        String strTwo = strOne + "= 4";
        System.out.println(strTwo);

        //How to find the length of string
        String name = "JavaClass";

        int len = name.length();

        System.out.println(len);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);

        if (s1.equals(s2)){
            System.out.println("True");
        }



    }
}
