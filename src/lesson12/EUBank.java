package lesson12;

/**
 * Created by Паша on 02.11.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double eveSalaryOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, eveSalaryOfEmployees, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 2000;
        return 2200;

    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 20000;
        return 10000;

    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD)
            return 0;
        else
            return 0.01;

    }

    @Override
    public double getCommission(int amount) {

        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.05;
            else
                return 0.07;

        } else {
            if (amount <= 1000)
                return 0.02;
            else
                return 0.04;

        }

    }
}
