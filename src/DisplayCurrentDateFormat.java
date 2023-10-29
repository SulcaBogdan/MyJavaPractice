import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplayCurrentDateFormat {
    public static void main(String[] args) {

        SimpleDateFormat cdt  = new SimpleDateFormat("yyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
    }
}
