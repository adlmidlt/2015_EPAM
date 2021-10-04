package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_1_array_3_level;

/*Task_1 3_Level_Array
* Condition
*    Return an array that contains exactly the same numbers as the given array,
*    but rearranged so that every 4 is immediately followed by a 5.
*    Do not move the 4's, but every other number may move.
*    The array contains the same number of 4's and 5's,
*    and every 4 has a number after it that is not a 4.
*    In this version, 5's may appear anywhere in the original array.
*/

public class ArrayFix45 {

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 5 && nums[j] == 4) {
                    int temp;
                    temp = nums[j + 1];
                    nums[j + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}
