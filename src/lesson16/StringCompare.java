package src.lesson16;


import java.util.Arrays;

/**
 * Created by Паша on 03.04.2018.
 */
public class StringCompare {
    public static void main(String[] args) {

        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println("abc" == "abc");
        System.out.println("Abc".equals("abc"));//+

        String s1 = "test";
        String s2 = "test";

        System.out.println(s1 == s2);

        //using intern

        String s3 = new String("pppp");
        String s4 = "pppp";

        System.out.println(s3 == s4);

        s3 = s3.intern();

        System.out.println(s3 == s4);


        //bytes of string

        String str = "testStringVar";
        System.out.println(Arrays.toString(str.getBytes()));

        System.out.println(new String(str.getBytes()));


        //User user1 = new User()
        //User user2 = new User()



       // test.intern();

      //  test.getBytes();



    }

    /**
     * Created by Паша on 04.04.2018.
     */

    public static class Solution {
        //  0. проверка адресса на  нал,и на ""
        //  1. должен начинаться с http:// или https://
        //  3. www не обязательно
        //  2. доменная зона должна разделяться точкой,допустимые - com,org,net
        //  4. другие точки в названии адресса,а так же спецсимволы не допускаются
        //

        public static void main(String args[]) {
            String text = "http://.com";
            //   System.out.println(minWord(text));
            //  System.out.println(maxWord(text));
            // System.out.println(mostCountedWord(text));
            System.out.println(validate(text));


        }


        public static boolean validate(String address) {
            //проверить стринг на нал или пустой
            //проверить чтобы адресс начинался с http:// и https://
            //проверить чтобы адресс заканчивался на .com,.org,.net
            // проверить адресс на входящие символы

            if (!address.startsWith("http://") && !address.startsWith("https://"))
                return false;
            if (!address.endsWith(".com") && !address.endsWith(".net") && !address.endsWith(".org"))
                return false;
            address = address.replace("www.", "");
            address = isValid(address, new String[]{"http://", "https://"});
            address = isValid(address, new String[]{".net", ".com", ".org"});
            return address != null && check(address);

        }

        //
        private static String isValid(String address, String[] parts) {
            for (String part : parts) {
                if (address.contains(part)) {
                    address = address.replace(part, "");
                    return address;
                }
            }
            return null;


        }


        private static boolean check(String body) {
            char[] chars = body.toCharArray();
            for (char c : chars) {
                if (!Character.isLetterOrDigit(c))
                    return false;

            }
            return true;


        }


        public static int countWords(String input) {

            int count = 0;
            String[] words = input.split(" ");  //разбиваю строку на массив слов по пробелу
            for (String word : words) { //считаем слова, в которых содержатся только буквы и не пустое ли слово
                if (check(word) && !word.isEmpty()) {
                    count++;       //сохраняем результат
                }
            }
            return count;
        }

        private static boolean isValidWord(String word) {   //проверяем слова, в которых содержатся только буквы
            if (word == null || word.isEmpty())
                return false;
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if (!Character.isLetter(c)) {
                    return false;
                }
            }
            return true;
        }


        private static String maxWord(String input) {
            String[] words = input.split(" ");
            if (words.length == 0)
                return null;
            String maxWord = null;
            for (String word : words) {
                if (word.length() > 0 && isValidWord(word)) {
                    maxWord = word;
                    break;
                }
            }
            if (maxWord == null)
                return null;
            for (String word : words) {
                if (word.length() > 0 && word.length() > maxWord.length() && isValidWord(word)) {
                    maxWord = word;
                }
            }
            return maxWord;
        }

        private static String minWord(String input) {
            String[] words = input.split(" ");
            if (words.length == 0)
                return null;
            String minWord = null;
            for (String word : words) {
                if (word.length() > 0 && isValidWord(word)) {
                    minWord = word;
                    break;
                }
            }
            if (minWord == null)
                return null;

            for (String word : words) {
                if (word.length() < minWord.length() && word.length() > 0 && isValidWord(word)) {
                    minWord = word;
                }
            }
            return minWord;
        }


        public static String mostCountedWord(String input) {


            //находим слово и сохраняем его
            // проверяем его на повторение
            // записываем его
            //проверяем на количество повторений
            String[] words = input.split(" ");
            if (words.length == 0)
                return null;
            int[] res = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                if (isValidWord(words[i]) && !words[i].equals("")) {
                    for (int j = 0; j < words.length; j++) {
                        if (!words[j].equals("") && isValidWord(words[j])) {
                            if (words[i].equals(words[j]))
                                res[i]++;
                        }
                    }
                }
            }
            //проверяем на количество повторений
            int count = 0;
            int maxCount = res[0];
            for (int i = 0; i < res.length; i++) {
                if (res[i] > maxCount) {
                    maxCount = res[i];
                    count = i;
                }
            }
            //проверяем есть ли повторяющиеся слова ,если нет то null
            if (count == 0 && maxCount < 1) {
                return null;
            } else if (count > 0)
                return words[count];

            return words[count];

        }


    }
}
