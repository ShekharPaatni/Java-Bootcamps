//Write a program to display times in different country format.


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CountryFormat {
    public static void main(String[] args) {
        String []  temp = TimeZone.getAvailableIDs();
        for (String temps: temp) {
            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(temps));
            System.out.println(temps+" "+calendar.get(Calendar.HOUR) + " : " + calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND));
        }
    }
}
