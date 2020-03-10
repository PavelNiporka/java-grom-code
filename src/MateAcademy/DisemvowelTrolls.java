package MateAcademy;

import java.util.Arrays;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        String text = "This website is for losers LOL!";
        // Вывод текста
        // //System.out.println(disem(text));

        String[] strArr = text.split(" ");//разбиваем текст на массив слов
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {

            char first = s.charAt(0); // первая буква каждого слова

            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'y') {

                sb.append(s).append(" ");
            }

        }
        String outText = sb.toString().trim();

        // вывод результата
        //   System.out.print(outText + " " + "\n\n");


    }


    public static String disemvowel(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a'
                    && str.charAt(i) != 'e'
                    && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u'
                    && str.charAt(i) != 'A'
                    && str.charAt(i) != 'E'
                    && str.charAt(i) != 'I'
                    && str.charAt(i) != 'O'
                    && str.charAt(i) != 'U') {
                string = string + str.charAt(i);
            }
        }
        return string;

    }


}
