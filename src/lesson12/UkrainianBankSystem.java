package lesson12;

/**
 * Created by Паша on 02.11.2017.
 */
public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        // проверить можно ли снять
        // проверить лимит
        // снять деньги
        //      int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();


        //     if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) {
        //         printWithdrawalErrorMsg(amount, user);
//            return;
        //      }

        //     if (amount + user.getBank().getCommission(amount) > user.getBalance()) {
        //           printWithdrawalErrorMsg(amount, user);
//            return;
//        }
        //   double balanceAfterWithdraw = user.getBalance() - amount - user.getBank().getCommission(amount);
        //  user.setBalance(balanceAfterWithdraw);
        if (!checkWithdraw(user, amount))
            return;

        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));


    }


    @Override
    public void fund(User user, int amount) {
        //TODO homework
        // проверяем макс лимит на пополнение
        // пополняем
        if (amount  > user.getBank().getLimitOfFunding()) {
            System.out.println("Cant funding money " + amount);
            return;
        }

        user.setBalance(user.getBalance() + amount);


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        // снимаем деньги с fromUser
        // пополняем toUser
        if (!checkWithdraw(fromUser, amount))
            return;
        //TODO check fund rules
        if(fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {

            withdraw(fromUser, amount);
           // fromUser.setBalance(fromUser.getBalance() - (amount - amount * fromUser.getBank().getCommission(amount)));
        } else return;
        //TODO fund


        fund(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        if(user.getSalary() > user.getBank().getLimitOfFunding()){
            System.out.println("Cant pay salary " + user.getSalary() + " for " + user.toString());
            return;
        }



        user.setBalance(user.getBalance() + user.getSalary());

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
}
