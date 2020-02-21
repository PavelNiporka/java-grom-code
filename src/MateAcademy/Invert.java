package MateAcademy;


import java.util.Arrays;

public class Invert {
    public static void main(String[] args) {
        int[] arr = {2, -5, 56, -80};

        System.out.print(Arrays.toString(invert(arr)));

    }

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= (-1);
        }
        return array;
    }

}
