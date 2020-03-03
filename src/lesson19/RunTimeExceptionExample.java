package lesson19;

public class RunTimeExceptionExample {

    public static void main(String[] args) {
        arithmeticException(2);
        try {


            arithmeticException(0);
        } catch (ArithmeticException e) {
            System.out.println("something wrong");
        }
        npe(new Object());
        npe(null);


    }

    private static void arithmeticException(int a) {
        System.out.println(10 / a);
    }

    private static void npe(Object object) {
        //        try {
        //           System.out.println(object.hashCode());
        //       } catch (NullPointerException e) {
        //           System.out.println();
        //       }
        if (object != null) {
            System.out.println(object.hashCode());
        }
    }


}
