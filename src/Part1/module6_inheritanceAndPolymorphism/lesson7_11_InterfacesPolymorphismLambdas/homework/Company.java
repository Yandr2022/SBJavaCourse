package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.Manager;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.abstraction.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private List<Employee> employeeList;
    private int fixSalary;
    private int income;
    private String name;

    public Company() {
        employeeList = new ArrayList<>();
    }


    public Company(List<Employee> employeeList, int fixSalary, String name) {
        this.employeeList = new ArrayList<>();
        hireAll(employeeList);
        this.name = name;
        this.fixSalary = fixSalary;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
    }

    public void hire(Employee employee) {
        employee.setCompany(this);
        employeeList.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        for (Employee emp : employees
        ) {
            emp.setCompany(this);
            employeeList.add(emp);
        }

    }

    public void fire(Employee employee) {
        employee.setCompany(null);
        employeeList.remove(employee);
    }

    public void calculateIncome() {
        for (Employee emp : employeeList) {
            if (emp instanceof Manager) {
                income += ((Manager) emp).getIncome();
            }
        }
    }

    public int getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count){
        employeeList.sort(Comparator.comparingInt(Employee::getMonthSalary));
        return new ArrayList<Employee>(employeeList.subList(0,count-1));
    }
    public List<Employee> getLowestSalaryStaff(int count){
        employeeList.sort((o1,o2)-> o2.getMonthSalary()- o1.getMonthSalary());
        return new ArrayList<Employee>(employeeList.subList(0,count-1));
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeeList=" + employeeList.size() +
                ", fixSalary=" + fixSalary +
                ", income=" + income +
                ", name='" + name + '\'' +
                '}';
    }
}
