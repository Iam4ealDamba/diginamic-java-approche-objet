package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2016);
    calendar.set(Calendar.MONTH, Calendar.MAY);
    calendar.set(Calendar.DAY_OF_MONTH, 19);
    calendar.set(Calendar.HOUR_OF_DAY, 23);
    calendar.set(Calendar.MINUTE, 59);
    calendar.set(Calendar.SECOND, 30);

    Date date = calendar.getTime();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println(dateFormat.format(date));

    Calendar calendar2 = Calendar.getInstance();
    date = calendar2.getTime();
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println(dateFormat2.format(date));
  }
}
