package main.java.com.app.tasks_1.task_1_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

/*
* 1.2.  Даны две даты в виде "25.07.1921", т.е.
* "день месяца 2 разряда, месяц 2 разряда, год 4 разряда".
 * Найти разницу в днях между ними. Число должно быть всегда положительным.
 * */

public class DifferenceOfDays {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1921, 7, 25);
        LocalDate date2 = LocalDate.of(1925, 9, 1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(date1.format(dateTimeFormatter));
        System.out.println(date2.format(dateTimeFormatter));
        System.out.println("Количество дней между date1 и date2 = " + date1.until(date2, ChronoUnit.DAYS) + " дней.");
    }
}
