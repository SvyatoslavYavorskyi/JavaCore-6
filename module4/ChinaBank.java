package module4;

/**
 * Created by Свят on 05.03.2017.
 */
public  class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, module4.Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {if (currency==currency.USD) return 100;
        if (currency==currency.EU) return 150;
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 5000;
        if (currency==currency.USD) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if (currency==currency.USD) return 1;
        else return 0;
        }



    @Override
    int getCommission(int summ) {
        if (currency==currency.USD){
            if (summ<=1000) return 3;
            if (summ>1000) return 5;
        }
        if (currency==currency.EU) {
            if (summ<=1000) return 10;
            if (summ>1000) return 11;
        }
        return 0;
    }

    @Override
    double getPaidMonthlyForSalary() {
        return numberOfEmployee*avrSalaryOfEmployee;
    }
    public String toString() {
        return "ID:" + this.id + " и страна:" +this.bankCountry;
    }
}
