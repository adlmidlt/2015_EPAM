package main.java.com.app.lecture_3_java_basic.tasks_array_2_level.task_1_array_2_level;

public class ArraySum13Run {

    public static void main(String[] args) {

        ArraySum13 result = new ArraySum13();
        System.out.println("{1, 2, 2, 1} -> " + result.sum13(new int[]{1, 2, 2, 1}));
        System.out.println("{1, 1} -> " + result.sum13(new int[]{1, 1}));
        System.out.println("{1, 2, 2, 1, 13} -> " + result.sum13(new int[]{1, 2, 2, 1, 13}));
    }
}
