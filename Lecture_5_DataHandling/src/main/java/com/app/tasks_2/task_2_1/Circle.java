package main.java.com.app.tasks_2.task_2_1;

import static java.lang.Math.*;

/*2.1.  Необходимо посчитать площадь круга с указанным радиусом с точностью 50 знаков после запятой
 */

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius * radius;
    }

    public double getArea() {
        return PI * this.getRadius();
    }
}
