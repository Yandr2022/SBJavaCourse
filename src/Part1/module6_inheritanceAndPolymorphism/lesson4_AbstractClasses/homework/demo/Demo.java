package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework.demo;

import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework.Client;
import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework.EntrepreneurAccount;
import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework.LegalEntityAccount;
import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.homework.PersonAccount;

public class Demo {
    public static void main(String[] args) {
        Client client = new PersonAccount(2000);
        System.out.println(client.getMoneyAmount());
        System.out.println(client.replenishAccount(100));
        System.out.println(client.replenishAccount(-100));
        client.showInfo();
        System.out.println(client.withdrawMoney(500));
        System.out.println(client.withdrawMoney(50000));
        System.out.println(client.getMoneyAmount());
        System.out.println("****************************************");

        client = new LegalEntityAccount(1000);
        System.out.println(client.getMoneyAmount());
        System.out.println(client.replenishAccount(100));
        System.out.println(client.replenishAccount(-100));
        client.showInfo();
        System.out.println(client.withdrawMoney(500));
        System.out.println(client.withdrawMoney(50000));
        System.out.println(client.getMoneyAmount());
        System.out.println("****************************************");

        client = new EntrepreneurAccount(1500);
        System.out.println(client.getMoneyAmount());
        System.out.println(client.replenishAccount(100));
        System.out.println(client.replenishAccount(-100));
        client.showInfo();
        System.out.println(client.withdrawMoney(500));
        System.out.println(client.withdrawMoney(50000));
        System.out.println(client.getMoneyAmount());
        System.out.println(client.replenishAccount(1000));
        System.out.println(client.getMoneyAmount());
        System.out.println("****************************************");

    }
}
