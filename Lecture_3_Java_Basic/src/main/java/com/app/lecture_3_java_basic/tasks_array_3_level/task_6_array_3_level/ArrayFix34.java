package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_6_array_3_level;

/*Task 6 array 3 level
* Condition
* Return an array that contains exactly the same numbers as the given array,
* but rearranged so that every 3 is immediately followed by a 4.
* Do not move the 3's, but every other number may move.
* The array contains the same number of 3's and 4's, every 3 has a
* number after it that is not a 3, and a 3 appears in the array before any 4.
*/

public class ArrayFix34 {

    public int[] getFix34(int[] numbers) {
        int tmp;
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (numbers[i] == 4 && numbers[j] == 3) {
                    tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        return numbers;
    }
}
