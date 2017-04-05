package module4;

/**
 * Created by Свят on 06.03.2017.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUsers(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal()>=(amount+amount * user.getBank().getCommission(amount) / 100)) {
            double balance = user.getBalance() - amount - amount * user.getBank().getCommission(amount) / 100;
            System.out.println("Balance after  = "+balance+" (Withdraw "+ user.getBank().getCommission(amount)+" % )");
        }
        else System.out.println("Summ out of limit!");

    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount<user.getBank().getLimitOfFunding()) {
            double balance = user.getBalance() + amount;
            System.out.println("Balance after = "+balance);
        }
        else System.out.println("Summ out of limit!");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().currency==toUser.getBank().currency) {
            double balfromU = fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount) / 100;
            double baltoU = toUser.getBalance() + amount;
            System.out.println("Balance "+fromUser.getName()+" after transfer = "+balfromU);
            System.out.println("Balance "+toUser.getName()+" after transfer = "+baltoU);
        }
        else System.out.println("Different currency!");
    }

    @Override
    public void paySalary(User user) {
            double userSalary = user.getSalary()*user.getMonthOfEmployment();
            System.out.println("Salary "+ user.getName()+ " for " + user.getMonthOfEmployment()
                   +userSalary + " " + user.getBank().currency);



        }
}
