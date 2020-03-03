package lesson8.accounts;

/**
 * Created by Паша on 05.08.2017.
 */
public class SavingAccount extends Account {
    int savingPerMonth;


    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

    @Override
    void changeOwnerName(String newOwnerName) {
        if (newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry,you can't change owner name of this saving account");
    }


}