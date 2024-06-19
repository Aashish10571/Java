import java.util.GregorianCalendar;

public class GregorianCalenderClass {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());
        System.out.println(calendar.isLeapYear(2020));
    }
}
