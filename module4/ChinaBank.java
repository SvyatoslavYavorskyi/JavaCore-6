package module4;

/**
 * Created by Свят on 05.03.2017.
 */
public  class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, module4.Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (equals(Currency.USD)) {
            return 100;
        }
        return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (equals(Currency.EUR)) {
            return 5000;
        }
        return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (equals(Currency.USD)) {
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (summ <= 1000 && equals(Currency.USD)) {
            return 3;
        }
        if (summ > 1000 && equals(Currency.USD)) {
            return 5;
        }
        if (summ <= 1000 && equals(Currency.EUR)) {
            return 10;
        }

        return 11;
    }

    @Override
    double getPaidMonthlyForSalary() {
        return 0;
    }
}
