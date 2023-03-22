package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class DateTimeAPI {
    public static void main(String[] args) {
        //local date
        LocalDate date = LocalDate.now();
        System.out.println(date);


            //local date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


         //get time
        LocalTime time = LocalTime.now();
        System.out.println(time);



        //date time method in java
        int dd= date.getDayOfMonth();
        int mm= date.getMonthValue();
        int yyyy= date.getYear();
        System.out.printf("%d%d%d",dd,mm,yyyy);
    }
}
