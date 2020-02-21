package MateAcademy;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        int[] array = {2, -4, 56, -237};
        System.out.println(findSmallestInt(array));

    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int element : args) {
            if (element < min)
                min = element;
        }
        return min;
    }

}
