package main.java.com.app.tasks_2.task_2_1;

import java.math.BigDecimal;

public class AreaCircleRun {

    public static void main(String[] args) {

        Circle circle = new Circle(6);
        double area = circle.getArea();
        BigDecimal resultArea = new BigDecimal(area).setScale(50);
        System.out.println("Площадь круга равна = " + resultArea);
    }
}
