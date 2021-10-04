package main.java.com.app.lecture_3_java_basic.tasks_array_3_level.task_8_array_3_level;

/*Task 8 array 3 level
* Condition
    Given n>=0, create an array length n*n with the following pattern,
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
    (spaces added to show the 3 groups).
*/

public class ArraySquareUp {

    public int[] squareUp(int n) {
        int numbers[] = new int[n * n];
        int a = n;

        for (int i = 0; i < n; i++) {
            int pos = n * n - i - 1;
            for (int j = 0; j < a; j++) {
                numbers[pos - n * j] = i + 1;
            }
            a--;
        }
        return numbers;
    }
}
