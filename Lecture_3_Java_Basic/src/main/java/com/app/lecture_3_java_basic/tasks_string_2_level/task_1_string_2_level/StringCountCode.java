package main.java.com.app.lecture_3_java_basic.tasks_string_2_level.task_1_string_2_level;

/*task_1 2_level_String
* Condition
    Return the number of times that the string "code" appears anywhere in
    the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

public class StringCountCode {

    public int countCode(String str) {

        int res = 0;
        int len = str.length();
        for (int i = 0; i <= len-4 ; i++) {
            if (str.substring(i,i+4).matches("co[a-z]e")) {
                res++;
            }
        }
        return res;
    }
}
