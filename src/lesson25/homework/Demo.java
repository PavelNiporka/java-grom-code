package lesson25.homework;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by Паша on 05.07.2018.
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        File file1 = new File(5, "Kiev");
        File file2 = new File(2, "Odessa");
        File file3 = new File(1, "Lvov");
        File file4 = new File(1, "Lvov");
        File file5 = new File(1, "Lvov");
        File file6 = new File(1, "Lvov");
        File file7 = new File(1, "Lvov");
        File file8 = new File(1, "Lvov");
        File file9 = new File(1, "Lvov");
        File file10 = new File(1, "Lvov");
        File file11 = new File(12, "Lvo");
        File file12 = new File(12, "Lvo");


        String string = "fr234";
        Integer l = 333333333;
        String string1 = " ";

        GeneralDAO<File> generalDAO1 = new GeneralDAO<>();
        GeneralDAO<String> generalDAO2 = new GeneralDAO<>();
        GeneralDAO<Integer> generalDAO3 = new GeneralDAO<>();
        GeneralDAO<String> generalDAO4 = new GeneralDAO<>();

        System.out.println(generalDAO1.save(file1));
        System.out.println(generalDAO1.save(file2));
        System.out.println(generalDAO1.save(file3));
        System.out.println(generalDAO1.save(file4));
        System.out.println(generalDAO1.save(file5));
        System.out.println(generalDAO1.save(file6));
        System.out.println(generalDAO1.save(file7));
        System.out.println(generalDAO1.save(file8));
        System.out.println(generalDAO1.save(file9));
     //   System.out.println(generalDAO1.save(file10));
      //  System.out.println(generalDAO1.save(file11));
      //  System.out.println(generalDAO1.save(file12));


        System.out.println(Arrays.deepToString(generalDAO1.getAll()));
        // System.out.println(Arrays.deepToString(generalDAO2.getAll()));
        //  System.out.println(Arrays.deepToString(generalDAO3.getAll()));
        //  System.out.println(Arrays.deepToString(generalDAO4.getAll()));

    }
}
