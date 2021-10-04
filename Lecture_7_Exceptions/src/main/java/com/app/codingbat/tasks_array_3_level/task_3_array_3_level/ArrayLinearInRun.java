package main.java.com.app.codingbat.tasks_array_3_level.task_3_array_3_level;

public class ArrayLinearInRun {

    public static void main(String[] args) {

        ArrayLinearIn result = new ArrayLinearIn();
        System.out.println(result.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(result.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(result.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}
