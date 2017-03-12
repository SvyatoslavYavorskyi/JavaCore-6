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
        if (equals(Currency.USD)) {
            return 2000;
        }
        return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (equals(Currency.EUR)) {
            return 20000;
        }
        return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (equals(Currency.USD)) {
            return 0;
        }
        return 1;
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
            return 2;
        }

        return 4;

    }

    @Override
    double getPaidMonthlyForSalary() {
        return 0;
    }
}
