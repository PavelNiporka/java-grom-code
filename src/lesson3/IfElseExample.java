package lesson3;

/**
 * Created by Паша on 20.04.2017.
 */
public class IfElseExample {
    public static void main(String[] args) {
        int test = 1000;
        if (test > 100) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }


        int test1 = 1000;
        boolean result = false;

        if (test1 > 1000) {
            result = true;

        } else
            System.out.println("not nice");
        if (result && test1 > 100 || test > 500) {
            System.out.println("!");
        } else {
            System.out.println("?");


            if (!(test1 > 0)) {
                System.out.println("!!!!!");
            }
        }
    }
}
