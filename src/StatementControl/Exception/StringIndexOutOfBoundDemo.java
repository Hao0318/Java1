package StatementControl.Exception;

public class StringIndexOutOfBoundDemo {
    public static void main(String[] args) {

        try {
            String str = "This is name";
            char c = str.charAt(200);
            System.out.println(c);

            }catch (StringIndexOutOfBoundsException e) {
            System.out.println("This is StringIndexOutOfBoundsException");
        }
    }
}
