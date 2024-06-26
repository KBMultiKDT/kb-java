package _0708_lambda_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q1_lambda {

    public static void main(String[] args) {
        //1.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

        //2.
//        List<String> strings = Arrays.asList("apple", "banana", "grape", "berry", "melon");
//        List<String> filteredStrings = strings.stream()
//                .filter(s -> s.length() >= 5)
//                .collect(Collectors.toList());
//        System.out.println(filteredStrings);

        //3.

                List<Employee> employees = Arrays.asList(
                        new Employee("John", 1),
                        new Employee("Doe", 2),
                        new Employee("Jane", 1),
                        new Employee("Smith", 3)
                );
                int departmentId = 1;

                List<String> filteredEmployees = employees.stream()
                        .filter(e -> e.getDepartmentId() == departmentId)
                        .map(Employee::getName)
                        .collect(Collectors.toList());
                System.out.println(filteredEmployees);
            }
}

class Employee {
    String name;
    int departmentId;

    Employee(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}