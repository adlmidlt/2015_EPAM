package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_5_array_3_level;

import java.util.Arrays;

public class ArraySeriesUpRun {

    public static void main(String[] args) {

        ArraySeriesUp result = new ArraySeriesUp();
        System.out.println("(3) -> " + Arrays.toString(result.getSeriesUp(3)));
        System.out.println("(4) -> " + Arrays.toString(result.getSeriesUp(4)));
        System.out.println("(2) -> " + Arrays.toString(result.getSeriesUp(2)));
    }
}
