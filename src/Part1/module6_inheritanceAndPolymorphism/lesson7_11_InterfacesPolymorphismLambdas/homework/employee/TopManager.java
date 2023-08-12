package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.Company;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.abstraction.Employee;

public class TopManager implements Employee {
    private Company company;

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        int bonus = company.getIncome() > 10_000_000 ? (company.getFixSalary() / 100) * 150 : 0;
        return company.getFixSalary() + bonus;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "company=" + company.getName() +
                '}';
    }
}
