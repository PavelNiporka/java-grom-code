package lesson4;

/**
 * Created by Паша on 30.04.2017.
 */
public class ComSums {
    public static void main(String[] args) {
        System.out.println(compareSums(2, 8, 4, 6));
        System.out.println(sum(3, 5));

    }

    public static boolean compareSums(int a, int b, int c, int d) {


        boolean compare = false;
        if (sum(a, b) > sum(c, d)) {
            compare = true;
        }

        return compare;

    }

    public static long sum(int from, int to) {
        long res = 0;
        for (long i = from; i <= to; i++) {

            res += i;


        }

        return res;
    }


}
