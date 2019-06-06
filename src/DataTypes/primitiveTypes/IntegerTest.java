package DataTypes.primitiveTypes;

public class IntegerTest {

    public static void main(String[] args) {

        int a = 12;
        int b = 23;
        int c = 78;

        int max;

        if ( a > b && a > c){
            max = a;
        }else if ( b > c){
            max = b;
        }
        else {
            max = c;
        }

        System.out.println(max);

        maximum(1, 2, 3);

        int n = 3;

        for (int i = 0; i < 16; i++) {
            n = Integer.rotateLeft(n, 1);
            System.out.println(n);

        }
        int numTwo = 10;
        System.out.println(Integer.signum(numTwo));

    }

    public static int maximum(int a, int b, int c){

        if ( b > a){
            a = b;
        }
        if ( c > a){
            a = c;
        }

        System.out.println(a);
        return a;
    }


}
