package module3.DZ34;

/**
 * Created by Свят on 19.02.2017.
 */
public class Users {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currence;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrence() {
        return currence;
    }

    public void setCurrence(String currence) {
        this.currence = currence;
    }




    void paySalary (){
        balance = balance+salary;
    }


    void withdraw (int summ){
        if (summ<1000){
        balance=balance -((int) (summ*1.05));
        }
        if (summ>=1000){
            balance=balance-((int) (summ*1.1));
        }


    }

    public int companyNameLenght(){
        int companyNameLenght = companyName.length();

        return companyNameLenght;
    }

    void monthlncreaser (int addMonth){
        monthsOfEmployment=monthsOfEmployment+addMonth;
    }

}
