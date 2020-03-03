package lesson18;

public class Solution {
    //определить длину массива целых чисел
    //создать массив целых чисел и заполнить его


    public static int[] findNumbers(String text) {
        if (text.isEmpty())
            return null;
        int count = 0;
        String[] words = text.split(" ");
        if (words.length == 0)
            return null;
        for (String word : words) {
            try {


                count++;

            } catch (Exception e) {
                System.out.println("not a number");
            }
        }
        int[] res = new int[count];
        int temp = 0;
        for (String word : words) {
            try {

                res[temp] = Integer.parseInt(word);
                temp++;
            } catch (Exception e) {

            }
        }
        return res;

    }

}
  /*  public static boolean checkNumber(String body) {
        for (char c : body.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
    */

