package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_8_array_3_level;

import com.app.lecture_3_java_basic.tasks_array_3_level.task_5_array_3_level.ArraySeriesUp;

import java.util.Arrays;

public class ArraySquareUpRun {

    public static void main(String[] args) {

        ArraySeriesUp result = new ArraySeriesUp();
        System.out.println("(3) -> " + Arrays.toString(result.getSeriesUp(3)));
        System.out.println("(2) -> " + Arrays.toString(result.getSeriesUp(2)));
        System.out.println("(4) -> " + Arrays.toString(result.getSeriesUp(4)));
    }
}
