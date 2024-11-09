package guru.springframework.spring5webapp.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestSalary {
    static class Employee {
        int id;
        String name;
        double salary;
        String department;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Employee(int id, String name, double salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Stream.of(
                new Employee(1, "Hardik", 50000, "DEV"),
                new Employee(1, "Jalaj", 40000, "QA"),
                new Employee(1, "Ashu", 70000, "DEVOPS"),
                new Employee(1, "Khushi", 20000, "DEV")
        ).collect(Collectors.toList());

        Comparator<Employee> comparingSalary = Comparator.comparing(Employee::getSalary);
        // System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(comparingSalary))));
        Map<String, List<Employee>> departmentGrouping = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String, Optional<Employee>> stringOptionalMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy(comparingSalary))));
        System.out.println(stringOptionalMap);

    }

}
