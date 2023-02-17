package helpers;

import base.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {

    public static Employee getNewEmployeeFromUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first name of an employee: ");
        String firstName = sc.nextLine();
        if (firstName.isBlank()) {
            System.out.println("ERROR! Input is empty. Please enter first name of an employee: ");
            new Scanner(System.in).nextLine();
        }

        System.out.println("Please enter last name of an employee: ");
        String lastName = sc.nextLine();
        if (lastName.isBlank()) {
            System.out.println("ERROR! Input is empty. Please enter last name of an employee: ");
            new Scanner(System.in).nextLine();
        }

        System.out.println("Please enter salary of an employee: ");
        int salary = getNumberFromUser();
        if (salary == 0) {
            System.out.println("ERROR! Salary have to be more than 0");
            new Scanner(System.in).nextInt();
        }

        return new Employee(firstName, lastName, salary);
    }

    public static int getNumberFromUser() {
        while (true) {
            try {
                return new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR - this is not a number! Please try again");
            }
        }
    }
}

