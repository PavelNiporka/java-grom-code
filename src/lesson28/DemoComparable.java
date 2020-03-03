package lesson28;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 16.07.2018.
 */
public class DemoComparable {
    public static void main(String[] args) {
        Capability capability1 = new Capability(1001, "Test", "rrrrr", true, new Date());
        Capability capability2 = new Capability(1005, "Test", "rrrrr", true, new Date());
        Capability capability3 = new Capability(900, "Test", "rrrrr", true, new Date());


        Set<Capability> set = new TreeSet<>();

        set.add(capability1);
        set.add(capability2);
        set.add(capability3);

        System.out.println(set);

    }


}
