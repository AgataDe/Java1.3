import base.Company;

import static helpers.InputData.getNewEmployeeFromUser;
import static helpers.InputData.getNumberFromUser;
import static helpers.ProgramMenu.printOptions;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        int numberOfEmployees = 5;

        for (int i = 0; i < numberOfEmployees; i++) {
            company.addNewEmployee(getNewEmployeeFromUser());
        }

        while (true) {
            printOptions();
            switch (getNumberFromUser()) {
                case 1 ->
                        System.out.println("The sum of employees salaries is: " + company.getSumOfAllEmployeesSalary());
                case 2 -> company.printInfoAboutAllEmployees();
                case 3 -> company.addNewEmployee(getNewEmployeeFromUser());
                case 4 -> System.exit(0);
                default -> System.out.println("Please choose one of the 4 options");
            }
        }
    }
}
