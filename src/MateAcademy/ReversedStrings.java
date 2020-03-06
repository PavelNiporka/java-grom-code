package MateAcademy;

public class ReversedStrings {

    public static void main(String[] args) {
        String string = "qwer";
        System.out.println(solution(string));

    }

    public static String solution(String str) {
        // return new StringBuilder(str).reverse().toString();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;

    }

}
