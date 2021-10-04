package main.java.com.app.codingbat.tasks_array_3_level.task_3_array_3_level;

/* Task_3 array_3_level
   Condition
    Given two arrays of ints sorted in increasing order,
    outer and inner, return true if all of the numbers in inner appear in outer.
    The best solution makes only a single "linear" pass of both arrays,
    taking advantage of the fact that both arrays are already in sorted order.
*/

public class ArrayLinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {
            if (outer[i] == inner[j]) {
                j++;
            }
        }
        return j == inner.length;
    }
}
