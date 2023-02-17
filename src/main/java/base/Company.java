package base;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printInfoAboutAllEmployees() {
        for (Employee allEmployees : employees) {
            System.out.println(allEmployees.toString() + "\r\n");
        }
    }

    public int getSumOfAllEmployeesSalary() {
        int sumOfAllEmployeesSalary = 0;
        for (Employee myEmployee : employees) {
            sumOfAllEmployeesSalary += myEmployee.getSalary();
        }
        return sumOfAllEmployeesSalary;
    }
}
