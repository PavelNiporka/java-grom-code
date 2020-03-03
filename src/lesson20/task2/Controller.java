package lesson20.task2;


import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

/**
 * Created by Паша on 08.06.2018.
 */
public class Controller {
    // private TransactionDAO transactionDAO = new TransactionDAO();

    public static Transaction save(Transaction transaction) throws Exception {
        return TransactionDAO.save(transaction);

    }

    public static Transaction[] transactionList() throws BadRequestException, InternalServerException {
        return TransactionDAO.transactionList();
    }

    public static Transaction[] transactionList(String city) throws BadRequestException, InternalServerException {
        return TransactionDAO.transactionList(city);

    }

    public static Transaction[] transactionList(int amount) throws Exception {
        return TransactionDAO.transactionList(amount);


    }


}
