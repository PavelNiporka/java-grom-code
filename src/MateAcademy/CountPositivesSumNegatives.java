package MateAcademy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        int[] array = {};
        System.out.print(Arrays.toString(countPositivesSumNegatives(array)));

    }

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                sum += input[i];
            }
        }
        int[] returnValues = new int[]{count, sum};
        return returnValues;

    }


}
