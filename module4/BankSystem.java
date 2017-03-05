package module4;

/**
 * Created by Свят on 06.03.2017.
 */
public interface  BankSystem {

    void withdrawOfUsers (User user, int amount);

    void fundUser (User user, int amount);

    void transferMoney (User fromUser, int amount);

    void  paySalary (User user);
}
