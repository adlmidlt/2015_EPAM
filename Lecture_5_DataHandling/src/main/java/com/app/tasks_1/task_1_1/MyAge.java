package main.java.com.app.tasks_1.task_1_1;

import java.time.LocalDateTime;

/*
* 1.1.  Определить ваш возраст с момента рождения (можно нафантазировать,
* если нет точных данных =) ) на момент запуска программы.
* Возраст в секундах, минутах, часах, днях, месяцах и годах.
* */

public class MyAge {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Текущая дата: " + localDateTime);

        System.out.println("Мой возраст: ");
        System.out.println(localDateTime.minusYears(1994).getYear() + " года,");
        System.out.println(localDateTime.minusMonths(4).getMonthValue() + " месяца,");
        System.out.println(localDateTime.minusDays(23).getDayOfMonth() + " дней,");
        System.out.println(localDateTime.minusHours(16).getHour() + " часов,");
        System.out.println(localDateTime.minusMinutes(0).getMinute() + " минут,");
        System.out.println(localDateTime.minusSeconds(0).getSecond() + " секунд.");
    }
}
