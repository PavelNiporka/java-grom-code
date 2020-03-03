package src.lesson2;

/**
 * Created by Паша on 19.04.2017.
 */
public class BrakeContinueExample {
    public static void main(String[] args) {
        int test = 10;


       /* while(test > 0){
            System.out.println(test);
            System.out.println("...");
            test--;
            break;
             */

        while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
            continue;

        }
        System.out.println("done");
    }
}
