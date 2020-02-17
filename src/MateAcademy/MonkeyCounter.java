package MateAcademy;

import java.sql.Array;
import java.util.Arrays;

public class MonkeyCounter {
    public static void main(String[] args) {
        monkeyCount(20);

    }

    public static int[] monkeyCount(final int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;

    }


}
