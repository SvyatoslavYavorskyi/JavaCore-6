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
        if (currency == currency.USD) return 1000;
        if (currency == currency.EU) return 1200;
        else return 0;

    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if (currency == currency.USD) return 1;
        if (currency == currency.EU) return 2;
        else return 0;
    }

    @Override
    int getCommission(int summ) {

        if (currency == currency.USD) {
            if (summ <= 1000) return 5;
            if (summ > 1000) return 7;
        }
        if (currency == currency.EU) {
            if (summ <= 1000) return 6;
            if (summ > 1000) return 8;
        }
        return 0;
    }

    @Override
    double getPaidMonthlyForSalary() {
        return numberOfEmployee * avrSalaryOfEmployee;
    }

    public String toString() {
        return "ID:" + this.id + " и страна:" +this.bankCountry;
    }
}
