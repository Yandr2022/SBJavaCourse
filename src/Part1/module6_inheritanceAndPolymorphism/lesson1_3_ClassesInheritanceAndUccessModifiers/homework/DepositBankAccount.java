package Part1.module6_inheritanceAndPolymorphism.lesson1_3_ClassesInheritanceAndUccessModifiers.homework;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DepositBankAccount extends BankAccount {

    public static void main(String[] args) {
        BankAccount account = new DepositBankAccount();
        BankAccount account1 = new CardBankAccount(300);
        System.out.println(account.getMoneyAmount());
        System.out.println(account.replenishAccount(200));
        System.out.println(account.replenishAccount(-20));
        System.out.println(account.getMoneyAmount());
        System.out.println(account.withdrawMoney(100));
        System.out.println(account.getMoneyAmount());
        System.out.println(((DepositBankAccount)account).withdrawMoney(100, LocalDate.now().plusDays(32)));
        System.out.println(account.getMoneyAmount());
        System.out.println(((DepositBankAccount)account).withdrawMoney(150, LocalDate.now().plusDays(32)));
        System.out.println(account.getMoneyAmount());
        System.out.println(account1.send(account,150));
        System.out.println(account.getMoneyAmount());
        System.out.println(account1.getMoneyAmount());
        System.out.println(account.send(account1, 100));
        ((DepositBankAccount) account).replenishDate = LocalDate.now().minusMonths(2);
        System.out.println(((DepositBankAccount) account).send(account1, 100));
        System.out.println(account.getMoneyAmount());
        System.out.println(account1.getMoneyAmount());



    }

    public LocalDate replenishDate;

    public DepositBankAccount() {
    }

    public DepositBankAccount(double moneyAmount) {
        super(moneyAmount);
    }

    @Override
    public boolean replenishAccount(double replenishment) {
        boolean result;
        if(result = super.replenishAccount(replenishment)) {
            replenishDate = LocalDate.now();
        }
        return result;
    }

    @Override
    public boolean withdrawMoney(double withdrawals) {
        boolean isSuccess = false;
            if (checkDate()) {
               isSuccess = super.withdrawMoney(withdrawals);
            } else {
            System.out.println("You can withdraw money after "
                    + replenishDate.plusMonths(1).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        }
            return isSuccess;
    }

    public boolean withdrawMoney(double withdrawals, LocalDate date) {
        boolean isSuccess = false;
            if (checkDate(date)) {
               isSuccess = super.withdrawMoney(withdrawals);
            } else {
            System.out.println("You can withdraw money after "
                    + replenishDate.plusMonths(1).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        }
            return isSuccess;
    }

    @Override
    public boolean send(BankAccount receiver, double amount) {
        boolean isSuccess = checkDate();
        if(isSuccess){
            isSuccess = super.send(receiver, amount);
        }
        return isSuccess;
    }


    private boolean checkDate(){
        return LocalDate.now().isAfter(replenishDate.plusMonths(1));
    }
    private boolean checkDate(LocalDate date){
        return date.isAfter(replenishDate.plusMonths(1));
    }
}
