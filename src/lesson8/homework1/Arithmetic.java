package lesson8.homework1;


/**
 * Created by Паша on 05.08.2017.
 */
public class Arithmetic {


    public boolean check(int[] array) {
        long a = array[0];
        long b = array[0];
        for (long max : array) {
            if (max > a) {
                a = max;

            }
        }
        for (long min : array) {
            if (min < b) {
                b = min;

            }
        }
        if (b + a >= 100) {

            return true;
        }

        return false;
    }
}