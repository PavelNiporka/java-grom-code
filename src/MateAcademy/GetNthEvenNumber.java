package MateAcademy;

public class GetNthEvenNumber {
    public static void main(String[] args) {
        System.out.println(nthEvn(3));
    }

    public static int nthEven(int n) {
        int num = 0;
        for (int i = 0; i < n * 2; i += 2) {
            num = i;
            System.out.println(num);
        }
        return num;

    }

    public static int nthEvn(int n) {
        System.out.println(n);
        return (n - 1) * 2;

    }


}
