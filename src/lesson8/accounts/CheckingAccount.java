package lesson8.accounts;

/**
 * Created by Паша on 05.08.2017.
 */
public class CheckingAccount extends Account {
    int limitOfExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpenses = limitOfExpenses;
    }

    void withdraw(int amount) {
        if (amount > limitOfExpenses)
            return;
        moneyAmount -= amount;


    }


}
