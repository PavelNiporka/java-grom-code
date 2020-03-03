package lesson4;

/**
 * Created by Паша on 22.04.2017.
 */
public class StringConcat {


    public static void main(String[] args) {
        System.out.println(concat("Я ", "стану ", "программистом"));
    }

    public static String concat(String s1, String s2, String s3) {
        s1 += s2 + s3;
        return s1;


    }

}
