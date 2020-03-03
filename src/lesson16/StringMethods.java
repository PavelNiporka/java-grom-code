package src.lesson16;


import java.util.Arrays;

/**
 * Created by Паша on 03.04.2018.
 */
public class StringMethods {
    public static void main(String[] args) {

        String test = "someStringExample";
        System.out.println(test.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(test.length());

        System.out.println(test.charAt(2));

        String res = test.replace("me", "T");
        System.out.println(res);


        System.out.println(test.replaceAll("me", "T"));


        // String regex = "{a-Z}";
        System.out.println(test);
        System.out.println(test.contains("mes"));


        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split(" ")));

        System.out.println(" test a".trim());

        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5,10).trim());

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());





        test.isEmpty();
        test.length();
        test.charAt(0);
        test.replace("e", "T");
        test.contains("e");

        test.split("");
        test.substring(1);
        test.toUpperCase();
        test.toLowerCase();

        test.getBytes();
        test.equals("eeee");
        test.intern();


    }


}
