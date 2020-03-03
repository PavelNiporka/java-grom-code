package lesson5;

import java.util.Arrays;

/**
 * Created by Паша on 30.04.2017.
 */
public class FirstArray {
    public static void main(String[] args) {
        int a; //declaration
        a = 10; // initialization


        //type of array [] name of array = new type of array [Lenght of array]
        int[] firstArray = new int[4];//declaration
        //array name [index] - get array element
        System.out.println(Arrays.toString(firstArray));


        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;
        for (int i = 0; i < firstArray.length; i++) {
       //     System.out.println(firstArray[i]);
        }
      //  System.out.println(firstArray);
       // System.out.println(Arrays.toString(firstArray));

        int b = 10;
      //  int[] secondArray = new ;
     //   System.out.print(Arrays.toString(secondArray));
        // for-each
      //  for (int element : secondArray.length) {
       //     System.out.print(element);
        }
      /*  for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.print(element);
        }*/


        // System.out.println(firstArray[0]);
        // System.out.println(firstArray[1]);
        // System.out.println(firstArray[2]);


    }


