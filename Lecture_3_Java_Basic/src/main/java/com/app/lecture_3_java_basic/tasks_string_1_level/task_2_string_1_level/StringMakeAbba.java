package main.java.com.app.lecture_3_java_basic.tasks_string_1_level.task_2_string_1_level;

/*Task 2 String 1 level
* Condition
    Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public class StringMakeAbba {

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
