package lesson20.task2;


import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;


//сумма транзакции больше указаного лимита+
// сумма транзакции за день больше дневного лимита+
//количество транзакций за день больше указаного лимита+
//если город оплаты(совершения транзакции) не разрешен badRequest+
// не хватило места internal+
// проверить одинаковые транзакции+

public class TransactionDAO {
    public static Transaction[] getTransactions() {
        return transactions;
    }

    private static Transaction[] transactions = new Transaction[10];
    // private Utils utils = new Utils();

    public static Transaction save(Transaction transaction) throws Exception {
        if (transaction == null) throw new BadRequestException("Null can't be saved");
        validate(transaction);
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr == null) {
                transactions[index] = transaction;
                return transactions[index];
            }
            index++;
        }
        throw new InternalServerException("Not enough free place for transaction ID  " + transaction.getId());
    }

    public static Transaction[] transactionList() {
        if (transactions == null)
            return null;
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null)
                count++;
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static Transaction[] transactionList(String city) {
        if (city == null || transactions == null)
            return null;
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && city.equals(transaction.getCity())) {
                count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static Transaction[] transactionList(int amount) {
        if (transactions == null || amount == 0)
            return null;
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static void validate(Transaction transaction) throws Exception {
        checkCity(transaction);
        findSameTransaction(transaction);
        checkLimits(transaction);
    }

    public static String checkCity(Transaction transaction) throws BadRequestException {
        for (String city : Utils.getCities()) {
            if (city != null && city.equals(transaction.getCity())) {
                return city;
            }
        }
        throw new BadRequestException("Wrong city input transaction ID " + transaction.getId());
    }

    public static void checkLimits(Transaction transaction) throws LimitExceeded {
        if (transaction.getAmount() > Utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceeded " + transaction.getId() + ". Can't be saved");
        int count = 0;
        int sum = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }
        if (sum + transaction.getAmount() > Utils.getLimitTransactionsPerDayAmount())
            throw new LimitExceeded("Transaction limit exceeded for the day " + transaction.getId() + ". Can't be saved");

        if (count + 1 > Utils.getLimitTransactionsPerDayCount())
            throw new LimitExceeded("Transaction limit exceeded for the day " + transaction.getId() + ". Can't be saved");
    }

    public static void findSameTransaction(Transaction transaction) throws BadRequestException {
        for (Transaction tr : transactions) {
            if (tr != null && tr.equals(transaction)) {
                throw new BadRequestException("Transaction  " + transaction.getId() + " already exist");
            }
        }
    }

    private static Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day)
                    count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }
}

