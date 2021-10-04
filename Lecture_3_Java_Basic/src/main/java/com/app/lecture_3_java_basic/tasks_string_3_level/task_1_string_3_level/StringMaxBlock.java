package main.java.com.app.lecture_3_java_basic.tasks_string_3_level.task_1_string_3_level;

/*Task_1 String_3_level
 * Condition
 *   Given a string, return the length of the largest "block" in the string.
 *   A block is a run of adjacent chars that are the same.
 */

public class StringMaxBlock {

    public int maxBlock(String str) {
        int len = str.length();
        int count = 0;
        int holderCount = 1;

        if (len == 0) {
            return 0;
        }

        for (int i = 0; i < len; i++) {
            if (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
                holderCount++;
            } else {
                holderCount = 1;
            }

            if (holderCount > count) {
                count = holderCount;
            }
        }
        return count;
    }
}
