package MateAcademy;

import javax.swing.text.Element;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;
import java.util.spi.AbstractResourceBundleProvider;

public class Tests {
    public static void main(String[] args) {
        String array = "rter";
        String array1 = "454354";
        int[] arrays = {76, 8, 6, 7};
        String[] array2 = {"", "2323rf", "2323111"};
        // System.out.println(hasNoneLetters(array, array1));
        System.out.println(findSmallestElement(arrays));
        System.out.println(countOddPositionChars(array2));

    }

    private static int stringLength(String input) {
        if (input == null || input.equals(""))
            return 0;
        else
            return input.length();

    }

    private static char getLastCharacter(String input) {

        return input.charAt(input.length() - 1);

    }

    private static int findSmallestElement(int[] nums) {
        if (nums.length == 0)
            return 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    public static int countOddPositionChars(String[] array) {
        if (array.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i].length();
        }
        return sum;

    }

    private static boolean hasNoneLetters(String blacklist, String phrase) {
        boolean sameLetter = true;
        char[] charPhrase = phrase.toLowerCase().toCharArray();
        char[] charBlacklist = blacklist.toLowerCase().toCharArray();
        for (char ch : charPhrase) {
            for (char c : charBlacklist) {
                if (ch == c) {
                    sameLetter = false;
                    break;
                }
            }
        }
        return sameLetter;
    }

}




