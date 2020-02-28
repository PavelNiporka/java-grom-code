package MateAcademy;

import java.util.spi.AbstractResourceBundleProvider;

public class NumbersEndingWithZerosAreBoring {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(0));

    }

    public static int noBoringZeros(int n) {
        if (n == 0)
            return 0;
        String str = String.valueOf(n);

        while (str.endsWith("0")) {
            if (str.charAt(str.length() - 1) == '0')
                str = str.substring(0, str.length() - 1);

        }
        return Integer.parseInt(str);
    }

}



