package StatementControl.Exception;

public class TwoNumber {

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return  true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TwoNumber two = new TwoNumber();
        System.out.println(two.in1020(99, 18));
    }
}
