package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_1_array_3_level;

import java.util.Arrays;

public class ArrayFix45Run {

    public static void main(String[] args) {

        ArrayFix45 result = new ArrayFix45();
        System.out.println(Arrays.toString(result.fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(result.fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(result.fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }
}
