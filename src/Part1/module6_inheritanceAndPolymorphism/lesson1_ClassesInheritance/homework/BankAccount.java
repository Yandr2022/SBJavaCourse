package Part1.module6_inheritanceAndPolymorphism.lesson1_ClassesInheritance.homework;

public class BankAccount {

    private double moneyAmount;

    public BankAccount() {
        this(0.);
    }

    public BankAccount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public boolean replenishAccount(double replenishment) {
        boolean result = replenishment > 0.;
        if (result) {
            moneyAmount += replenishment;
        } else {
            System.out.println("Wrong replenishment");
        }
        return result;
    }

    public boolean withdrawMoney(double withdrawals) {
        boolean isSuccess = withdrawals <= moneyAmount;
        if (isSuccess) {
            moneyAmount -= withdrawals;
        } else {
            System.out.println("Your account does not have enough money");
        }
        return isSuccess;
    }

    public boolean send(BankAccount receiver, double amount){
        boolean isSuccess = withdrawMoney(amount);
        if(isSuccess){
            receiver.replenishAccount(amount);
        }
        return isSuccess;
    }
}
