package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_7_array_3_level;

public class ArrayMaxMirrorRun {

    public static void main(String[] args) {

        ArrayMaxMirror result = new ArrayMaxMirror();
        System.out.println("{1, 2, 3, 8, 9, 3, 2, 1} -> " + result.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println("{1, 2, 1, 4} -> " + result.maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println("7, 1, 2, 9, 7, 2, 1} -> " + result.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}
