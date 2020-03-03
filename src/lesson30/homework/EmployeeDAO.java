package lesson30.homework;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 19.07.2018.
 */
public class EmployeeDAO {
    private Set<Employee> employees = new TreeSet<>();

    public EmployeeDAO(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeeDAO{" +
                "employees=" + employees +
                '}';
    }
}
