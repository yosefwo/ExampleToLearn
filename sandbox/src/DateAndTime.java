import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yy HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        DateTimeFormatter dtfNoTime = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(dtfNoTime.format(now1));
    }
}
