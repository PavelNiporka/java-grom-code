package src.lesson10.abstractbigexample;


/**
 * Created by Паша on 16.09.2017.
 */
public abstract class Employee {

    private String name;
    private int age;
    private int yearOfExperience;
    private String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];


    abstract void paySalary();


    void changePosition(String newPosition) {
        // сохранить текущую позицию в историю +
        // поменять позицию +
        saveCurPositionToHistory();
        curPosition = newPosition;

    }

    private void saveCurPositionToHistory() {
        int index = 0;
        for (String pos : positionsWorked) {
            if (pos == null) {
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }


    }

    int getBalance() {
        bankAccount.getBalance();
        return bankAccount.getBalance();

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}
