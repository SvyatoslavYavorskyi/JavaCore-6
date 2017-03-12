package module4;

import static java.lang.Long.parseLong;

/**
 * Created by Свят on 06.03.2017.
 */
public interface  BankSystem {



    static double withdrawOfUsers(User user, int amount){
        double a=  user.getBalance() - amount;

         if (a<0){
            return 0;
         }

         return a;
    }

    static double fundUser(User user, int amount){
        double a;
        a=user.getBalance()+amount;
        return a ;
    }

    static String transferMoney(User fromUser, User toUser, int amount){
        double a ;
        double b;
        a=fromUser.getBalance()-amount;
        b=toUser.getBalance()+amount;
        return "Successfully";
    }

    static double paySalary (User user){
        double a;
        a=user.getBalance()+user.getSalary();
        return a;
    }
}
