package lesson18;

public class Solution1 {

    public static int[] findNumbers(String text) {
        if (text.isEmpty())
            return null;
        int count = 0;
        String[] words = text.split(" ");
        if (words.length == 0)
            return null;
        for (String word : words) {
            if (checkNumber(word) && !word.isEmpty()) {
                count++;
            }
        }
        int[] res = new int[count];
        int temp = 0;

        for (String word : words) {
            if (checkNumber(word) && !word.isEmpty()) {
                res[temp] = Integer.parseInt(word);
                temp++;
            } else System.err.println(word + " not a number");

        }

        return res;

    }

    public static boolean checkNumber(String body) {
        for (char c : body.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }


}
