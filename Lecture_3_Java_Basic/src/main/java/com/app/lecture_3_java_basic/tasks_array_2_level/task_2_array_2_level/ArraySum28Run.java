package main.java.com.app.lecture_3_java_basic.tasks_array_2_level.task_2_array_2_level;

public class ArraySum28Run {

    public static void main(String[] args) {

        ArraySum28 result = new ArraySum28();
        System.out.println("{2, 3, 2, 2, 4, 2} -> " + result.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println("{2, 3, 2, 2, 4, 2, 2} -> " + result.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println("{1, 2, 3, 4} -> " + result.sum28(new int[]{1, 2, 3, 4}));
    }
}
