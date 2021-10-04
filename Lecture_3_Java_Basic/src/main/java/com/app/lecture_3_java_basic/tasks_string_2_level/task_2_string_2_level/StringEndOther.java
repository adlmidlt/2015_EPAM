package main.java.com.app.lecture_3_java_basic.tasks_string_2_level.task_2_string_2_level;

/*Task_2 String 3 level
* Condition
*  Given two strings, return true if either of the strings appears at the very
*  end of the other string, ignoring upper/lower case differences
*  (in other words, the computation should not be "case sensitive").
*  Note: str.toLowerCase() returns the lowercase version of a string.
*/

public class StringEndOther {

    public boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();

        // Метод endsWith() - проверяет заканчивается ли эта строка указанным значением
        if (aLow.endsWith(bLow) || bLow.endsWith(aLow)) {
            return true;
        }
        return false;
    }
}
