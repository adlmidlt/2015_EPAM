package main.java.com.app.tasks_1.task_1_3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*(* “2016-08-16T10:15:30+08:00” в дату со временем с учетом часового пояса  - привести к ижевскому).*/

public class ZoneDate {

    public static void main(String[] args) {

        String date = "2016-08-16T10:15:30+08:00";
        ZonedDateTime input = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime : " + input);
        System.out.println("ZonedDateTime Izhevsk: " + input.withZoneSameInstant(ZoneId.systemDefault()));
    }
}
