import java.util.Calendar;

public class CalenderClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone().getID());
        System.out.println();

        System.out.println("Time And Date");
        System.out.println(calendar.getTime());
        System.out.println();

        System.out.println("Time");
        System.out.println(calendar.get(Calendar.HOUR) + " : " + calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND));
    }
}
