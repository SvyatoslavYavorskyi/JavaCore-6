package module4;

import java.util.Currency;

/**
 * Created by Свят on 05.03.2017.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    int getPaidMonthlyForSalary() {
        return 0;
    }
}
