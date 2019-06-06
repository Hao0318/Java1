package StatementControl.Exception;
/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */
public class TwoTemperature {

    public static void main(String[] args) {
        TwoTemperature one = new TwoTemperature();
        System.out.println(one.icyHot(2, 120));

    }
    public boolean icyHot(int a, int b) {
        if((a < 0 && b > 100) || (a > 100 && b < 0)){
            return true;
        }else {
            return false;
        }
    }
}
