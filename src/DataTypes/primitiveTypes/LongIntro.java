package DataTypes.primitiveTypes;

import java.util.Date;

public class LongIntro {

    public static void main(String[] args) {

        long l1 = 10;

        Long longObj = new Long (11);
        System.out.println(longObj);

        long timeInMilleSecond = new Date().getTime();
        System.out.println("Time is MilliSeconds :" + timeInMilleSecond);
    }
}
