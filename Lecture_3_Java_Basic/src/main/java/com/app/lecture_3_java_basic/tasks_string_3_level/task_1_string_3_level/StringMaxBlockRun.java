package main.java.com.app.lecture_3_java_basic.tasks_string_3_level.task_1_string_3_level;

public class StringMaxBlockRun {

    public static void main(String[] args) {

        StringMaxBlock result = new StringMaxBlock();
        System.out.println("Hello -> " + result.maxBlock("Hello"));
        System.out.println("abbCCCddBBBxx -> " + result.maxBlock("abbCCCddBBBxx"));
        System.out.println("\"\" -> " + result.maxBlock(""));
    }
}
