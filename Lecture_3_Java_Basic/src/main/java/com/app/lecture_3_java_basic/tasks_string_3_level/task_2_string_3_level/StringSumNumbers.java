package main.java.com.app.lecture_3_java_basic.tasks_string_3_level.task_2_string_3_level;

/*Task_2 String_3_level
* Condition
*   Given a string, return the sum of the numbers appearing in the string,
*   ignoring all other characters. A number is a series of 1 or more digit chars in a row.
 *  (Note: Character.isDigit(char)
 *  tests if a char is one of the chars '0', '1', .. '9'.
 *  Integer.parseInt(string) converts a string to an int.)
*/

public class StringSumNumbers {

    public int sumNumbers(String str) {
        int len = str.length();
        int sum = 0;
        String tmp = "";

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < len - 1 && Character.isDigit(str.charAt(i + 1))) {
                    tmp += str.charAt(i);
                } else {
                    tmp += str.charAt(i);
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }
            }
        }
        return sum;
    }
}
