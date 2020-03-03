package lesson30.homework;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 19.07.2018.
 */
public class DepartmentDAO {

    private Set<Department> departments = new TreeSet<>();

    public DepartmentDAO(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "DepartmentDAO{" +
                "departments=" + departments +
                '}';
    }
}
