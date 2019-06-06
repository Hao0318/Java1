package DataTypes.ReferenceDataType;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class CalendarIntro {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.clear();

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MARCH, 5);
        calendar.set(Calendar.DATE, 15);

        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);

        Calendar now = Calendar.getInstance();
        System.out.println("12 Hour format : " + now.get(Calendar.HOUR));
        System.out.println("Minut format : " + now.get(Calendar.MINUTE));



    }
}
