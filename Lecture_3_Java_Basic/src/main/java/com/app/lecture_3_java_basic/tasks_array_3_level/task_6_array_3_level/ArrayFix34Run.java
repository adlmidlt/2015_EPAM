package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_6_array_3_level;

import java.util.Arrays;

public class ArrayFix34Run {

    public static void main(String[] args) {

        ArrayFix34 result = new ArrayFix34();
        System.out.println("{1, 3, 1, 4} ->" + Arrays.toString(result.getFix34(new int[]{1, 3, 1, 4})));
        System.out.println("{1, 3, 1, 4, 4, 3, 1} ->" + Arrays.toString(result.getFix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println("{3, 4, 2, 2} -> " + Arrays.toString(result.getFix34(new int[]{3, 4, 2, 2})));
    }
}
