package lesson9;

/**
 * Created by Паша on 10.08.2017.
 */
public class Employee {
    protected String name;
    protected Company company;
    int monthlySalary;

    public Employee(String name, Company company, int monthlySalary) {
        this.name = name;
        this.company = company;
        this.monthlySalary = monthlySalary;
    }
}
