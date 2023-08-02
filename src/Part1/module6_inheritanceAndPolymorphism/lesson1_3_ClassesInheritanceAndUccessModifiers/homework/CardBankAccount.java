package Part1.module6_inheritanceAndPolymorphism.lesson1_3_ClassesInheritanceAndUccessModifiers.homework;



public class CardBankAccount extends BankAccount {
    public static void main(String[] args) {
        BankAccount account = new CardBankAccount();
        System.out.println(account.getMoneyAmount());
        System.out.println(account.replenishAccount(200));
        System.out.println(account.replenishAccount(-20));
        System.out.println(account.getMoneyAmount());
        System.out.println(account.withdrawMoney(100));
        System.out.println(account.getMoneyAmount());

    }

    public CardBankAccount() {
    }

    public CardBankAccount(double moneyAmount) {
        super(moneyAmount);
    }

    @Override
    public boolean withdrawMoney(double withdrawals) {
        double bankingFee = withdrawals/100 *1;
            return  super.withdrawMoney(withdrawals + bankingFee);
    }

}
