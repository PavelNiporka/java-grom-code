package src.lesson10.abstractbigexample;

/**
 * Created by Паша on 16.09.2017.
 */
public class DeveloperEmployee extends Employee {
    private String[] frameworks = new String[10];

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);

    }
}
