package MateAcademy;

import java.util.Arrays;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        String text = "zdes text iz";
        // Вывод текста
        System.out.println(text);

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
        System.out.print(outText + " " + "\n\n");


    }


    public static String disemvowel(String str) {
        StringBuilder sb = new StringBuilder();
        String[] string = str.split(" ");
        for (String s : string) {
            char first = s.charAt(0);
            if (first == 'A' || first == 'a' || first == 'E' || first == 'e' ||
                    first == 'O' || first == 'o' || first == 'I' || first == 'i')
                sb.append(s).append(" ");
        }
        return null;
    }

}
