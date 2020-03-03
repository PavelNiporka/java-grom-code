package lesson5;

/**
 * Created by Паша on 30.04.2017.
 */
public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = {5};
        System.out.println(maxElement(array));
        System.out.println(nCount(array, 0));


    }

    public static int maxElement(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;
        for (int el : array) {
            if (el == n)
                count++;
        }
        return count;


    }


}
