package MateAcademy;

public class RegexpBasicsIsItADigit {
    public static void main(String[] args) {
        System.out.println(isDigital(" "));

    }

    public static boolean isDigit(String s) {
        char[] ch = s.toCharArray();
        if (s.equals("") || s.equals(" ") || !s.matches("[0-9]"))
            return false;
        for (char c : ch) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static boolean isDigital(String s) {
        return s.matches("[0-9]");


    }

}
