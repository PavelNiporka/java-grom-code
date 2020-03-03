package lesson28;

import java.util.Comparator;

/**
 * Created by Паша on 16.07.2018.
 */
public class FullComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        // если channelName не равно - сравниваю по нему +
        // если равно - переходим к fingerPrint+
        // если fingerPrint не равно - сравниваем по нему+
        // если равно - переходим к DateCreated+
        // если DateCreated не равно - сравниваем по нему+
        // если равно - обьекты равны+
        System.out.println("FullComparator is used");

        if (!o1.getChannelName().equals(o2.getChannelName()))
            return o1.getChannelName().compareTo(o2.getChannelName());
        if (!o1.getFingerPrint().equals(o2.getFingerPrint()))
            return o1.getFingerPrint().compareTo(o2.getFingerPrint());
        if (o1.getDateCreated().after(o2.getDateCreated()))
            return o1.getDateCreated().compareTo(o2.getDateCreated());
        return 0;
    }
}



