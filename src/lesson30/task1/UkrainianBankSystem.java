package lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 02.11.2017.
 */
public class UkrainianBankSystem implements BankSystem {
    private Set<Transaction> transactions = new TreeSet<>();


    @Override
    public void withdraw(User user, int amount) {

        if (!checkWithdraw(user, amount))
            return;

        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));

        createAndSaveTransaction(new Date(), TransactionType.WITHDRAWAL, amount, "sdsds");


    }


    @Override
    public void fund(User user, int amount) {
        //TODO homework
        // проверяем макс лимит на пополнение
        // пополняем
        if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("Cant funding money " + amount);
            return;
        }

        user.setBalance(user.getBalance() + amount);

        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "sdsds");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        // снимаем деньги с fromUser
        // пополняем toUser
        if (!checkWithdraw(fromUser, amount))
            return;
        //TODO check fund rules
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {

            withdraw(fromUser, amount);
            // fromUser.setBalance(fromUser.getBalance() - (amount - amount * fromUser.getBank().getCommission(amount)));
        } else return;
        //TODO fund


        fund(toUser, amount);

        createAndSaveTransaction(new Date(), TransactionType.TRANSER, amount, "sdsds");
    }

    @Override
    public void paySalary(User user, int amount) {
        if (user.getSalary() > user.getBank().getLimitOfFunding()) {
            System.out.println("Cant pay salary " + user.getSalary() + " for " + user.toString());
            return;
        }
        user.setBalance(user.getBalance() + user.getSalary());
        createAndSaveTransaction(new Date(), TransactionType.SALARYINCOME, amount, "sdsds");
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());


    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;

        }
        return true;
    }


    private void printWithdrawalErrorMsg(int amount, User user) {

        System.err.println("can`t withdraw money " + amount + " from user " + user.toString());

    }

    private Transaction createAndSaveTransaction(Date date, TransactionType type, int amount, String description) {
        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), date, null, type, amount, description);
        transactions.add(tr);
        return tr;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}
