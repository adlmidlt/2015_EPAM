package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_2_array_3_level;

/*Task_2 array_3_Level
* Condition
*   Given a non-empty array, return true if there is a place to split
*   the array so that the sum of the numbers on one side is equal to
*   the sum of the numbers on the other side.
*/

public class ArrayCanBalance {

    public boolean canBalance(int[] nums) {
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = 0;
            for (int j = nums.length-1; j > i; j--) {
                rightSum += nums[j];
            }
            if (rightSum == leftSum)
            return true;
        }
        return false;
    }
}
