package lesson28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Паша on 16.07.2018.
 */
public class DemoComparator {
    public static void main(String[] args) {

        Capability capability1 = new Capability(1001, "cest", "arrrr", true, new Date(2018, 7, 16));
        Capability capability2 = new Capability(1005, "best", "crrrr", false, new Date(2018, 7, 14));
        Capability capability3 = new Capability(900, "aest", "brrr", true, new Date(2018, 7, 15));

        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        //  System.out.println(capabilities);

        capabilities.sort(new DateComparator());


        System.out.println(capabilities);


    }

}
