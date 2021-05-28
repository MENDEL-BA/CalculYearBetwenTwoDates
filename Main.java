
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

class Main {
  public static void main(String[] args) {

    long diff = getDiffYears(new Date(), new Date());

        System.out.println("Hello world! "+diff);

  }

  public static int getDiffYears(Date first, Date last) {
    Calendar a = getCalendar(first);
    Calendar b = getCalendar(last);
    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
            (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
      diff--;
    }
    return diff;
  }

  public static Calendar getCalendar(Date date) {
    Calendar cal = Calendar.getInstance(Locale.FRENCH);
    cal.setTime(date);
    return cal;
  }

}