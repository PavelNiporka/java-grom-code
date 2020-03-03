package lesson18.exercise2;

public class Converter {
    public static void main(String[] args) {
        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));
        System.out.println(stringToInt("1050a"));

        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));

        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));


    }

    public static String intToString(int input) {
        return String.valueOf(input);
    }

    public static int stringToInt(String input) {
        try {


            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " can not be converted do int");
            return 0;
        }
    }


}
