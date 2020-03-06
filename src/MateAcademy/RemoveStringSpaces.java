package MateAcademy;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        String str = "2323 ewrer  24324  e23 ";
        System.out.println(noSpace(str));
    }

    static String noSpace(final String x) {
         return x.replaceAll(" ","");
       // return new StringBuilder(x).reverse().toString();
    }
}
