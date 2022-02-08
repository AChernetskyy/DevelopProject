package ozzyProject.day5.employeeTask;

import java.util.Arrays;
import java.util.List;

public class EmployeeTesting {
    public static void main(String[] args) {
        List<Employee>employeeList= Arrays.asList(
                new Employee(100, "Anton", "jack@gmail", Arrays.asList("12333344","112222233")),
                new Employee(101, "Mila", "mils@gmail", Arrays.asList("12333344566","1164542222233")),
                new Employee(102, "Jeck", "jeck@gmail", Arrays.asList("1233334444","112222234543")),
                new Employee(103, "Bunny", "bunny@gmail", Arrays.asList("123333488948","189812222233")),
                new Employee(104, "Kid", "kid@gmail", Arrays.asList("12333348984","1122222338"))

        );

        //Print all emails-->One to One
        employeeList.stream().map(employee -> employee.getEmpEmail()).forEach(System.out::println);

        //Print all phone numbers
        employeeList.stream().map(employee -> employee.getEmpPhoneNumber()).forEach(System.out::println);

        //Print each number separately
        EmployeData.readAll().flatMap(employee -> employee.getEmpPhoneNumber().stream()).forEach(System.out::println);

        //Second way--readAll is custom the method
        EmployeData.readAll().map(Employee::getEmpPhoneNumber).flatMap(List::stream).forEach(System.out::println);

    }
}
