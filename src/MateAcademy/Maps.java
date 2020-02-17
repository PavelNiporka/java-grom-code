package MateAcademy;

import java.lang.reflect.Array;

public class Maps {
    public static void main(String[] args) {
        int[] array = {2, 3, 5};
        map(array);
        System.out.println(map(array));

    }

    static int[] map(int[] arr) {
        int[] count = new int[arr.length];

        for (int i = 0; i < count.length; i++) {
            count[i] = count[i * 2];
        }
        return count;
    }

}
