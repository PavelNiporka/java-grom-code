package lesson30.homework;

import java.util.Collection;

/**
 * Created by Паша on 19.07.2018.
 */
public class Department {
    private DepartmentType type;
    private Collection employees;

    public Department(DepartmentType type, Collection employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public void setEmployees(Collection employees) {
        this.employees = employees;
    }

    public Collection getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
                ", employees=" + employees +
                '}';
    }
}
