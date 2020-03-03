package src.lesson5;

/**
 * Created by Паша on 14.05.2017.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        System.out.println(uniqueCount(arr));

    }

    public static int uniqueCount(int[] array) {

        if (array.length == 0) {
            return 0;
        }
        int unique_cnt = 1;
        boolean unique = true;
        for (int i = 1; i < array.length; i++) {
            unique = true;

            for (int j = i - 1; j >= 0; j--) {


                if (array[j] == array[i]) {
                    unique = false;
                }
            }

            if (unique) {
                unique_cnt++;
            }
        }
        return unique_cnt;
    }
}
