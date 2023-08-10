package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework;


public class LegalEntityAccount extends Client {
    public static void main(String[] args) {


    }

    static {
        setDescription("Replenishment occurs without commission, withdrawal with 1% commission");
    }

    public LegalEntityAccount() {
    }

    public LegalEntityAccount(double moneyAmount) {
        setMoneyAmount(moneyAmount);
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
        double bankingFee = withdrawals / 100 * 1;
        boolean isSuccess = (withdrawals + bankingFee) <= getMoneyAmount();
        if (isSuccess) {
            setMoneyAmount(getMoneyAmount() - (withdrawals + bankingFee));
        } else {
            System.out.println("Your account does not have enough money");
        }
        return isSuccess;
    }

}
