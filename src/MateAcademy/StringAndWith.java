package MateAcademy;

public class StringAndWith {

    public static void main(String[] args) {
        System.out.println(solution("qwe", "er"));

    }

    public static boolean solution(String str, String ending) {
        boolean check = true;
        if (!str.endsWith(ending))
            check = false;
        return check;

    }

}
