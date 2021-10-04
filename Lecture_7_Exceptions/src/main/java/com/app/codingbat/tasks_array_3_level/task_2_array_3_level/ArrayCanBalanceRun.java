package main.java.com.app.codingbat.tasks_array_3_level.task_2_array_3_level;

public class ArrayCanBalanceRun {

    public static void main(String[] args) {

        ArrayCanBalance result = new ArrayCanBalance();
        System.out.println(result.canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(result.canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(result.canBalance(new int[]{10, 10}));
    }
}
