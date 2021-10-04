package main.java.com.app.codingbat.tasks_array_3_level.task_4_array_3_level;

public class ArrayMaxSpanRun {

    public static void main(String[] args) {

        ArrayMaxSpan result = new ArrayMaxSpan();
        System.out.println("{1, 2, 1, 1, 3} -> " + result.getMaxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println("{1, 4, 2, 1, 4, 1, 4} -> " + result.getMaxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println("{3, 9, 3} -> " + result.getMaxSpan(new int[]{3, 9, 3}));
    }
}
