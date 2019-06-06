package DataTypes.primitiveTypes;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Formatter;
import java.util.Locale;

public class NumberFormateIntro {

    public static void main(String[] args) {
        NumberFormat numberFormat =  NumberFormat.getInstance(Locale.US);

        System.out.println(numberFormat.getClass().getName());
        System.out.println(numberFormat.format(123456));

        Formatter formatter = new Formatter();
        formatter.format("%1.4f", 1234567890.123456789);
        System.out.println(formatter);
        formatter.format("%5.7s", "abc");
        System.out.println("\n");
        System.out.println(formatter);
        int numOne = 1500;
        String formatNumOne = String.format("%07d", numOne);
        System.out.println(formatNumOne);
    }
}
