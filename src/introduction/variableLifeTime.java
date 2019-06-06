package introduction;

public class variableLifeTime {

    public static void main(String[] args) {

        // this is the for loop and loop will run 4 times
        for (int i = 0; i < 4; i ++ ){

            int y = -1;
            System.out.println("Y = " + y);
            y = 100;
            System.out.println("now Y =" + y);


        }
    }
}
