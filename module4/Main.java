package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by Свят on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        USBank americanExpress = new USBank(1, "hfs", USD, 122, 45355.34, 3553, 12340000);
        EUBank kredoBank = new EUBank(2, "Polish", EUR, 123, 34667.43, 2000, 35000000);
        ChinaBank chinaBank = new ChinaBank(12, "China", USD, 45, 56499, 1000, 4560000);

        User user1 = new User(1, "Sasha", 8000, 10, "google", 10000, americanExpress);
        User user2 = new User(2, "Kolya", 10000, 23, "Krogel", 20000, americanExpress);
        User user3 = new User(3, "Sveta", 5000, 7, "Figure", 7000, kredoBank);
        User user4 = new User(4, "Zhanna)", 15000, 17, "Vodafone", 180, kredoBank);
        User user5 = new User(5, "Vassa", 2000, 40, "Shinomontazh", 5000, chinaBank);
        User user6 = new User(6, "Stepan", 5000, 32, "Umbro", 30000, chinaBank);

        System.out.println(user1.getName() + "   " + BankSystem.withdrawOfUsers(user1, 1000));
        System.out.println(BankSystem.fundUser(user1, 2000));
        System.out.println(BankSystem.transferMoney(user1, user2, 2000));
        System.out.println(BankSystem.paySalary(user1));

        System.out.println(user2.getName() + "   " + BankSystem.paySalary(user2));
        System.out.println(BankSystem.transferMoney(user2, user3, 5000));
        System.out.println(BankSystem.fundUser(user2, 6000));
        System.out.println(BankSystem.withdrawOfUsers(user2, 3000));

        System.out.println(user3.getName() + "   " + BankSystem.paySalary(user3));
        System.out.println(BankSystem.transferMoney(user3, user4, 6000));
        System.out.println(BankSystem.fundUser(user3, 500));
        System.out.println(BankSystem.withdrawOfUsers(user3, 1000));

        System.out.println(user4.getName() + "   " + BankSystem.paySalary(user4));
        System.out.println(BankSystem.transferMoney(user4, user5, 4500));
        System.out.println(BankSystem.fundUser(user4, 1000));
        System.out.println(BankSystem.withdrawOfUsers(user4, 10000));

        System.out.println(user5.getName() + "   " + BankSystem.paySalary(user5));
        System.out.println(BankSystem.transferMoney(user5, user6, 7000));
        System.out.println(BankSystem.fundUser(user5, 8000));
        System.out.println(BankSystem.withdrawOfUsers(user5, 7700));

        System.out.println(user6.getName() + "   " + BankSystem.paySalary(user6));
        System.out.println(BankSystem.transferMoney(user6, user1, 5000));
        System.out.println(BankSystem.fundUser(user6, 100));
        System.out.println(BankSystem.withdrawOfUsers(user6, 44));


    }

}
