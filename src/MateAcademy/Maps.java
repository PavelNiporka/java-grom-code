package MateAcademy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        int[] doubled = {3, 5, 6};
        System.out.println(Arrays.toString(map(doubled)));

    }

    static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;


        }
        return arr;
    }

}

