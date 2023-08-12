package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.Company;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.abstraction.Employee;

public class Operator implements Employee {
    private Company company;

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return company.getFixSalary();
    }

    @Override
    public String toString() {
        return "Operator{" +
                "company=" + company.getName() +
                '}';
    }
}
