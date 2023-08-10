package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework;


public class EntrepreneurAccount extends Client {

    static {
        setDescription("Withdrawal occurs without commission,replenishment < 1000 - with 1% commission," +
                " >=1000 - with 0.5% commission");
    }

    public EntrepreneurAccount() {
    }

    public EntrepreneurAccount(double moneyAmount) {
        setMoneyAmount(moneyAmount);
    }

    @Override
    public boolean replenishAccount(double replenishment) {
        boolean isSuccess = replenishment > 0.;
        if (isSuccess) {
            replenishment -= replenishment < 1000 ? replenishment / 100 * 1 : replenishment / 100 * 0.5;
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
