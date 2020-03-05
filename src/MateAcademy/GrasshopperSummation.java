package MateAcademy;

import javax.crypto.spec.PSource;

public class GrasshopperSummation {

    public static void main(String[] args) {
        System.out.println(summation(5));
        int[] arrays = {4,5,6,7};
        System.out.println(adjacentElementsProduct(arrays));

    }

    public static int summation(int n) {
        if (n <= 0)
            return 0;
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int adjacentElementsProduct(int[] array) {
        if (array.length == 0)
            return 0;
        int max = array[0] * array[1];

        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i] * array[i + 1])
                max = array[i] * array[i + 1];
        }

        return max;
    }


}
