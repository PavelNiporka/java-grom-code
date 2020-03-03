package lesson30.task1;

/**
 * Created by Паша on 02.11.2017.
 */
public interface BankSystem {
    void withdraw(User user, int amount);

    void fund(User user, int amount);

    void transferMoney(User fromUser, User userToUser, int amount);

    void paySalary(User user,int amount);


}
