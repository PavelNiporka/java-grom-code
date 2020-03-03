package lesson30.homework;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Паша on 19.07.2018.
 */
public class Firm {
    private   Date dateFounded;
    private   Collection<Department> departaments;
    private   Collection<Customer> customers;

    public Firm(Date dateFounded, Collection<Department> departaments, Collection<Customer> customers) {
        this.dateFounded = dateFounded;
        this.departaments = departaments;
        this.customers = customers;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(Date dateFounded) {
        this.dateFounded = dateFounded;
    }

    public Collection<Department> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Collection<Department> departaments) {
        this.departaments = departaments;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Firm firm = (Firm) o;

        return dateFounded.equals(firm.dateFounded);
    }

    @Override
    public int hashCode() {
        return dateFounded.hashCode();
    }

    @Override
    public String toString() {
        return "Firm{" +
                "dateFounded=" + dateFounded +
                ", departaments=" + departaments +
                ", customers=" + customers +
                '}';
    }
}
