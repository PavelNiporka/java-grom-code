package src.lesson3;

/**
 * Created by Паша on 21.04.2017.
 */
public class FindOdd {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (a <= 999) {
            if (a % 2 == 0) {
            } else {
                System.out.println("Found");
                b = b + a;

            }
            a++;
        }
        if (b * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }


    }
}
