package DataTypes.ReferenceDataType;

public class StringPartTwo {

    public static void main(String[] args) {

        String str = "abcde";

        if(str.startsWith("bc")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if (str.endsWith("dee")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println(str.charAt(2));

        String text = "To be or not to be, that is some information";
        System.out.println(text);
        String newText = text.replace(' ', '*');
        System.out.println(newText);

        String myStr = "Str A" + 5*5;
        System.out.println(myStr);

        String strThree = "abcdea";
        int index = 0;
        index = strThree.lastIndexOf('a');
        System.out.println(index);
    }
}
