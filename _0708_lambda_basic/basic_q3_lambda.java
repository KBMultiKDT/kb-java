package _0708_lambda_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class Employee2 {
        String name;
        String department;
        int age;

        Employee2(String name, String department, int age) {
            this.name = name;
            this.department = department;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public int getAge() {
            return age;
        }
    }

    public class basic_q3_lambda {
        public static void main(String[] args) {
            List<Employee2> employees = Arrays.asList(
                    new Employee2("Michael", "Manager", 35),
                    new Employee2("Sarah", "HR", 32),
                    new Employee2("Roger", "Manager", 44),
                    new Employee2("Mike", "Manager", 30),
                    new Employee2("Maureen", "IT", 37)
            );

            double averageAge = employees.stream()
                    .filter(e -> "Manager".equals(e.getDepartment()) && e.getName().startsWith("M"))
                    .mapToInt(Employee2::getAge)
                    .average()
                    .orElse(0);  // Default to 0 if no suitable employees found

            System.out.println(averageAge);
        }
    }


