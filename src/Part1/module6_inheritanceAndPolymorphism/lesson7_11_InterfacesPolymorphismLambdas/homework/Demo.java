package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.Manager;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.Operator;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.TopManager;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.homework.employee.abstraction.Employee;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            employeeList.add(new Operator());
            if(i<80){
                employeeList.add(new Manager());
                if(i<10){
                    employeeList.add(new TopManager());
                }
            }
        }
        System.out.println(employeeList.size());
Company company  = new Company(employeeList,7500,"MyCompany");
        company.calculateIncome();
        System.out.println(company.getIncome() );
        for (Employee emp: company.getLowestSalaryStaff(20)
             ) {
            System.out.println(emp +": "+ emp.getMonthSalary());
        }
        System.out.println("*********************");
        for (Employee emp: company.getTopSalaryStaff(200)
             ) {
            System.out.println(emp +": "+ emp.getMonthSalary());
        }


    }
}
