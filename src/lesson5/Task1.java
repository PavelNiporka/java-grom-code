package lesson5;

import java.util.Arrays;

/**
 * Created by Паша on 02.05.2017.
 */
public class Task1 {
    public static void main(String[] args) {


        int[] sortAscending = {6, 2, 10, 8, 14, 43, 54, 21};
        int[] sortDescending = {2, 5, 8, 23, 41, 21, 55, 66, 6, 11};


        System.out.println(Arrays.toString(sortAscending(sortAscending)));
        System.out.println(Arrays.toString(sortDescending(sortDescending)));

    }


    public static int[] sortAscending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }

        }
        return array;
    }


    public static int[] sortDescending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }
        return array;

    }
}





