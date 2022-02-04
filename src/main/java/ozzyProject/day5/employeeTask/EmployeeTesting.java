package ozzyProject.day5.employeeTask;

import java.util.List;

public class EmployeeTesting {
    public static void main(String[] args) {
        //Print all emails-->One to One
        EmployeData.readAll().map(employee -> employee.getEmpEmail()).forEach(System.out::println);

        //Print all phone numbers
        EmployeData.readAll().map(employee -> employee.getEmpPhoneNumber()).forEach(System.out::println);

        //Print each number separately
        EmployeData.readAll().flatMap(employee -> employee.getEmpPhoneNumber().stream()).forEach(System.out::println);

        //Second way
        EmployeData.readAll().map(Employee::getEmpPhoneNumber).flatMap(List::stream).forEach(System.out::println);

    }
}
