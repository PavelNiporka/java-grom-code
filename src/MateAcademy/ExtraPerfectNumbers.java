package MateAcademy;


import java.util.Arrays;

public class ExtraPerfectNumbers {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(extraPerfect(10)));

    }

    public static int[] extraPerfect(int number) {
        int[] set = new int[(number + 1) / 2];
        for (int i = 0; i < set.length; i++)
            set[i] = 1 + i * 2;
        return set;
    }


}
