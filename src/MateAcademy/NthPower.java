package MateAcademy;

public class NthPower {
    public static void main(String[] args) {
        int[] arr = {2,3,8,5,2};
        System.out.println(nthPower(arr,4));

    }

    public static int nthPower(int[] array, int n) {
        int result = 1;
        if (n < array.length) {
            for (int i = 0; i < n; i++) {
                result *= array[n];
            }
            return result;
        }
        return -1;
    }

}