package lesson20.task2;

/**
 * Created by Паша on 08.06.2018.
 */
public class Utils {
    private static int limitTransactionsPerDayCount = 150;
    private static int limitTransactionsPerDayAmount = 150;
    private static int limitSimpleTransactionAmount = 150;
    private static String[] cities = {"Kiev", "Odessa"};


    public static int getLimitTransactionsPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public static int getLimitTransactionsPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public static int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public static String[] getCities() {
        return cities;
    }
}

