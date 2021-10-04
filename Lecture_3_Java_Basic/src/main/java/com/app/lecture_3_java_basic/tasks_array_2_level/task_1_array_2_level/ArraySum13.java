package main.java.com.app.lecture_3_java_basic.tasks_array_2_level.task_1_array_2_level;

/*Task_1 array 2 level
* Condition
    Return the sum of the numbers in the array, except ignore sections of numbers
    starting with a 6 and extending to the next 7
    (every 6 will be followed by at least one 7).
    Return 0 for no numbers.
*/

public class ArraySum13 {

    public int sum13(int[] nums) {
        int sum = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
                if (i > 0 && nums[i - 1] == 13) {
                    sum -= nums[i];
                }
            }
        }
        return sum;
    }
}
