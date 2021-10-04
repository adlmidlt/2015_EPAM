package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_5_array_3_level;

/*Task 5 array 3 level
* Condition
* Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
(spaces added to show the grouping). Note that the length of the array will be
* 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
*/

public class ArraySeriesUp {

    public int[] getSeriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int i = 0;
        for (int j = 1; j <= n; ++j) {
            for (int k = 1; k <= j; ++k) {
                result[i++] = k;
            }
        }
        return result;
    }
}
