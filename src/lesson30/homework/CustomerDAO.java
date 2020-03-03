package lesson30.homework;


import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 19.07.2018.
 */
public class CustomerDAO {

     private Set<Customer> customers = new TreeSet<>();

    public CustomerDAO(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerDAO{" +
                "customers=" + customers +
                '}';
    }
}
