package _13_StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();

        //for each
        employees.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));

        // method referencing
        employees.stream().forEach(System.out::println);

        //filter
        //filtering employees where department is 'Development' and salary is greater than 85000
        employees.stream().filter(e -> e.getDept().equals("Development") && e.getSalary() > 85000).forEach(System.out::println);

        // returning filtered map for same filter
        Map<Integer, String> filteredEmp = employees.stream().filter(e -> e.getDept().equals("Development") && e.getSalary() > 85000).collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(filteredEmp);

        //map
        // using distinct
        List<String> depts = employees.stream().map(e -> e.getDept()).distinct()// can also use method reference here as Employee::getDept
                .collect(Collectors.toList());

        //using set
        Set<String> depts2 = employees.stream().map(Employee::getDept).collect(Collectors.toSet());
        // mapping list inside object, it'll return stream so for working on list inside an object we usually use flatmap
        List<Stream<String>> projects = employees.stream().map(e -> e.getProjects().stream().map(p -> p.getName())).collect(Collectors.toList());

        //flatMap
        List<String> p2 = employees.stream()
                .flatMap(e -> e.getProjects().stream())
                .map(Project::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(projects);
        System.out.println(depts);
        System.out.println(depts2);
        System.out.println(p2);

        // sorted
        // ascending sorting
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparing(e -> e.getSalary()))
                .collect(Collectors.toList());
        // descending sorting
        List<Employee> sortedBySalary2 = employees.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(e -> e.getSalary())))
                .collect(Collectors.toList());
        System.out.println(sortedBySalary);
        System.out.println(sortedBySalary2);

        //min and max
        Optional<Employee> highestPaidEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> lowestPaidEmployee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(highestPaidEmployee);
        System.out.println(lowestPaidEmployee);
    }
}
