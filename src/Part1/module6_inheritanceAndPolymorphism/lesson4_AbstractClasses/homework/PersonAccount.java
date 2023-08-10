package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework;

public class PersonAccount extends Client {

    static {
        setDescription("Replenishment and withdrawal occurs without commission");
    }

    public PersonAccount() {
    }

    public PersonAccount(double moneyAmount) {
        this.setMoneyAmount(moneyAmount);
    }

    @Override
    public boolean replenishAccount(double replenishment) {
        boolean isSuccess = replenishment > 0.;
        if (isSuccess) {
            setMoneyAmount(getMoneyAmount() + replenishment);
        } else {
            System.out.println("Wrong replenishment");
        }
        return isSuccess;
    }

    @Override
    public boolean withdrawMoney(double withdrawals) {
        boolean isSuccess = withdrawals <= getMoneyAmount();
        if (isSuccess) {
            setMoneyAmount(getMoneyAmount() - withdrawals);
        } else {
            System.out.println("Your account does not have enough money");
        }
        return isSuccess;
    }

}
