package MateAcademy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        int[] array = {-2, -5, -6};
        System.out.print(sum(array));

    }

    public static int[] countPositivesSumNegatives(int[] input) {
        return null;
    }

    public static int sum(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) {
                count++;
                sum += arr[count];
            }
                return sum;
    }

}
