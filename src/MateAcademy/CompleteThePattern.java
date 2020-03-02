package MateAcademy;

import javax.crypto.spec.PSource;
import javax.swing.text.html.parser.Parser;
import javax.xml.parsers.ParserConfigurationException;

public class CompleteThePattern {
    public static void main(String[] args) {
        int n = 553453543;
      //  System.out.println(pattern(n));


    }

    public static String pattern(int n) {

        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                str += (n - j);
            }
            if (i < n - 1) {
                str += "\n";
            }
        }
        return str;
    }


}
