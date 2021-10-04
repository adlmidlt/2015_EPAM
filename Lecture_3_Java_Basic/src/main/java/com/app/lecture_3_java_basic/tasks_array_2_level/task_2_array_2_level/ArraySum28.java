package main.java.com.app.lecture_3_java_basic.tasks_array_2_level.task_2_array_2_level;

/*Task 2 array 2 level
* Condition
*   Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.*/

public class ArraySum28 {

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            if (i == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }
}
