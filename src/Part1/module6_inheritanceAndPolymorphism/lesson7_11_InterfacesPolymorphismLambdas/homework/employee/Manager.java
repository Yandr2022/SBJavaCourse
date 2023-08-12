package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.Company;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.abstraction.Employee;

import java.util.Random;

public class Manager implements Employee {
    private Company company;

    private int income;

    @Override
    public int getMonthSalary() {
        return (income * 5) / 100 + company.getFixSalary();
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    public int getIncome() {
        return income = (int) (115000 + 25000. * Math.random());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "company=" + company.getName() +
                ", income=" + income +
                '}';
    }
}
