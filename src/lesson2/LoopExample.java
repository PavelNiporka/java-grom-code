package src.lesson2;

/**
 * Created by Паша on 19.04.2017.
 */
public class LoopExample {
    public static void main(String[] args) {
        long a = 0;
        long b = 0;

        while (a <= 99999999) {
            a++;
            b = b + a;

        }
        System.out.println(b);

    }
}



