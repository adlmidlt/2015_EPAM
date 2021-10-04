package main.java.com.app.tasks_2.task_2_3;

import java.math.BigDecimal;

/*2.3. Даны три числа. Нужно найти минимум и максимум
        не используя условный и тернарный операторы
 */

public class ThreeNumbers {

    public static void main(String[] args) {

        BigDecimal decimal_1 = new BigDecimal("1234");
        BigDecimal decimal_2 = new BigDecimal("1434");
        BigDecimal decimal_3 = new BigDecimal("1334");

        BigDecimal decimalResultMax = decimal_1.max(decimal_2).max(decimal_3);
        BigDecimal decimalResultMin = decimal_1.min(decimal_2).min(decimal_3);

        String strMax  = "Максимальное значение из (" + decimal_1 + ", " + decimal_2 + ", " + decimal_3 + ") = " +
                decimalResultMax;
        System.out.println(strMax);

        String strMin  = "Минимальное значение из (" + decimal_1 + ", " + decimal_2 + ", " + decimal_3 + ") = " +
                decimalResultMin;
        System.out.println(strMin);
    }
}
