package main.java.com.app.codingbat.tasks_array_3_level.task_4_array_3_level;

/*Task 4 array 3 level
* Condition
* Consider the leftmost and righmost appearances of some value in an array.
* We'll say that the "span" is the number of elements between the two inclusive.
* A single value has a span of 1. Returns the largest span found in the given array.
*/

public class ArrayMaxSpan {

    public int getMaxSpan(int[] numbers) {
        int span = 0;
        int tmp;
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (numbers[i] == numbers[j]) {
                    tmp = j - i + 1;
                    span = Math.max(tmp, span);
                }
            }
        }
        return span;
    }
}
