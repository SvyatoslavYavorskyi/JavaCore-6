package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by Свят on 05.03.2017.
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (equals(Currency.USD)) {
            return 1000;
        }

        return 1200;

    }

    @Override
    int getLimitOfFunding() {
        if (equals(Currency.EUR)) {
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (equals(Currency.USD)) {
            return 1;
        }
        return 2;
    }

    @Override
    int getCommission(int summ) {

        if (summ <= 1000 && equals(Currency.USD)) {
            return 5;
        }
        if (summ > 1000 && equals(Currency.USD)) {
            return 7;
        }
        if (summ <= 1000 && equals(Currency.EUR)) {
            return 6;
        }

        return 8;
    }

    @Override
    double getPaidMonthlyForSalary() {
        return 0;
    }


}
