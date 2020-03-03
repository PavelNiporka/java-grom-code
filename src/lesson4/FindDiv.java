package lesson4;

/**
 * Created by Паша on 24.04.2017.
 */
public class FindDiv {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) 5, (short) 10, 2));

    }


    public static int findDivCount(short a, short b, int n) {

        int count = 0;
        for (int i = a; i <= b; i++) {

            if (a >= 0 && a <= b && i % n == 0 && n > 0 && i >= 0)
                count++;

        }
        return count;
    }
}