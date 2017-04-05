package module4;

/**
 * Created by Свят on 05.03.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, module4.Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency == currency.USD) return 2000;
        if (currency == currency.EU) return 2200;
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 20000;
        if (currency == currency.USD) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if (currency == currency.EU) return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        if (currency == currency.USD) {
            if (summ <= 1000) return 5;
            if (summ > 1000) return 7;
        }
        if (currency == currency.EU) {
            if (summ <= 1000) return 2;
            if (summ > 1000) return 4;
        }
        return 0;

    }

    @Override
    double getPaidMonthlyForSalary() {
        return numberOfEmployee * avrSalaryOfEmployee;
    }

    public String toString() {
        return "ID:" + this.id + " и страна:" + this.bankCountry;
    }
}