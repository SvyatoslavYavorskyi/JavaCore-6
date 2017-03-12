package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by Свят on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        USBank americanExpress = new USBank(1,"hfs",USD,122,45355.34,3553,12340000);
        EUBank kredoBank=new EUBank(2,"Polish",EUR,123,34667.43,2000,35000000);
        ChinaBank chinaBank=new ChinaBank(12,"China",USD,45,56499,1000,4560000);

        User user1 = new User(1,"Sasha",8000,10,"google",10000,americanExpress);
        User user2 = new User(2,"Kolya",10000,23,"Krogel",20000,americanExpress);
        User user3 = new User(3,"Sveta",5000,7,"Figure",7000,kredoBank);
        User user4 = new User(4,"Zhanna)",15000,17,"Vodafone",180,kredoBank);
        User user5 = new User(5,"Vassa",2000,40,"Shinomontazh",5000,chinaBank);
        User user6 = new User(6,"Stepan",5000,32,"Umbro",30000,chinaBank);

        System.out.println(user1.getBank().getCommission(4000));
        System.out.println(user2.getBank().getAvrSalaryOfEmployee());
        System.out.println(user3.getBank().getCurrency());
        System.out.println(user4.getBank().getLimitOfWithdrawal());
        System.out.println(user5.getBank().getMonthlyRate());
        System.out.println(user6.getBank().getPaidMonthlyForSalary());
        System.out.println(user1.getBank().getLimitOfFunding());
        System.out.println(user1.getBank().getPaidMonthlyForSalary());
        System.out.println(user2.getBank().getCommission(5000));
        System.out.println(user4.getBank().getCommission(10000));

    }
}
