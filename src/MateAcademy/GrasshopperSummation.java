package MateAcademy;

public class GrasshopperSummation {

    public static void main(String[] args) {
        System.out.println(summation(5));

    }

    public static int summation(int n) {
        if (n <= 0)
            return 0;
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }
}
