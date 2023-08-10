package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework;

public abstract class Client {
    private double moneyAmount;
     private static String  description;

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public String getDescription() {
        return description;
    }

    protected void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    static protected void setDescription(String description) {
        Client.description = description;
    }

    public void showInfo(){
        System.out.printf("Amount of money in a bank account: %.2f\nDescription: %s\n",moneyAmount, description);
    }

    public abstract boolean replenishAccount(double replenishment);
    public abstract boolean withdrawMoney(double withdrawals);
}
