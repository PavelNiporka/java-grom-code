package lesson30.homework;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 21.07.2018.
 */
public class FirmDAO {

    private Set<Firm> firms = new TreeSet<>();

    public FirmDAO(Set<Firm> firms) {
        this.firms = firms;
    }

    public Set<Firm> getFirms() {
        return firms;
    }

    public void setFirms(Set<Firm> firms) {
        this.firms = firms;
    }

    @Override
    public String toString() {
        return "FirmDAO{" +
                "firms=" + firms +
                '}';
    }


}
