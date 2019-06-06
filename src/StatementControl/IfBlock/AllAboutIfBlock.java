package StatementControl.IfBlock;

public class AllAboutIfBlock {

    public static void main(String[] args) {

        // simple if block
        int num = 5;

        if (num < 5){
            System.out.println("If bolck works");

        }else{
            System.out.println("Else block works");
        }

        //More into if block
        int numberOfLoginAttempts = 10;
        int numberOfMinimumLoginAttempts = 12;
        int numberOfMaximumLoginAttempts = 13;
        int y = 3;

        //count number of login attempts
        if (numberOfLoginAttempts < numberOfMaximumLoginAttempts || numberOfMinimumLoginAttempts > y) {
            y++;

            System.out.println(y);

        }
        //when there is only one if block curly braces are optional
        //however it's hard to tell whick if bolck is associates with else bolck
        int a = 3, b = 1;

        if (a > 0 || b < 5)
            if (a > 2)
                System.out.println("a > 2");
            else
                System.out.println("a < 2");
         // there for always use curly braces after every IF statement
    }
}
