package main.java.com.app.tasks_1.task_1_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*Дана строка вида "Friday, Aug 10, 2016 12:10:56 PM".
  Необходимо сконвертировать ее в вид “2018-08-10".
*/

public class DateString {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a", Locale.US);
        String date = "Friday, Aug 12, 2016 12:10:56 PM";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.print(date + " -> ");
        System.out.println(localDate.plusYears(2).minusDays(2));

    }
}
