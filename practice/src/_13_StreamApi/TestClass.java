package _13_StreamApi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();
        employees.stream().forEach(e-> System.out.println(e.getName()+ ' '+ e.getSalary()));
        //for each
        employees.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));

        employees.stream().forEach(System.out::println);

        // method referencing
        employees.stream().forEach(System.out::println);

        employees.stream().filter(e-> e.getSalary() > 85000 && e.getDept().equals("Development")).forEach(System.out::println);

        //filter
        //filtering employees where department is 'Development' and salary is greater than 85000
        employees.stream().filter(e -> e.getDept().equals("Development") && e.getSalary() > 85000).forEach(System.out::println);

        Map<Integer, String> filteredEmps = employees.stream().filter(e-> e.getDept().equals("Development") && e.getSalary() > 85000).collect(Collectors.toMap(Employee::getId, Employee::getName));

        // returning filtered map for same filter
        Map<Integer, String> filteredEmp = employees.stream().filter(e -> e.getDept().equals("Development") && e.getSalary() > 85000).collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(filteredEmp);

        //map
        // using distinct

        List<String> dep = employees.stream().map(e-> e.getDept()).distinct().collect(Collectors.toList());
        List<String> depts = employees.stream().map(e -> e.getDept()).distinct()// can also use method reference here as Employee::getDept
                .collect(Collectors.toList());


        //using set
        Set<String> depts2 = employees.stream().map(Employee::getDept).collect(Collectors.toSet());
        // mapping list inside object, it'll return stream so for working on list inside an object we usually use flatmap
        employees.stream().flatMap(e-> e.getProjects().stream()).map(p-> p.getName()).distinct().collect(Collectors.toList());

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

        // grouping by
        Map<String, List<Employee>> groups = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(groups);

        Map<String, List<String>> groupsWithName = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));

       Map<String, Long> deptWithCount =  employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println(groupsWithName);
        System.out.println(deptWithCount);

        //find first
       Optional<Employee> maxSalaryFemale= employees.stream().filter(e-> e.getGender().equals("Female")).max(
                Comparator.comparingDouble(Employee::getSalary)
        );
        Optional<Employee> maxSalaryFemale2= employees.stream().filter(e-> e.getGender().equals("Female")).sorted(
                Comparator.comparingDouble(Employee::getSalary).reversed()
        ).findFirst();
        System.out.println(maxSalaryFemale);
        System.out.println(maxSalaryFemale2);

        Employee maxSalaryFemale3= employees.stream().filter(e-> e.getGender().equals("Female"))
                .findFirst().orElseThrow(() -> new RuntimeException("No Female in the office"));

        Employee findAnyFemale= employees.stream().filter(e-> e.getGender().equals("Female"))
                .findAny().orElseThrow(() -> new RuntimeException("No Female in the office"));
        System.out.println(findAnyFemale);

        //anymatch allmatch nonematch

        boolean anyFemaleExists = employees.stream().anyMatch(e -> e.getGender().equals("Female"));
        System.out.println(anyFemaleExists);

        boolean allFemale = employees.stream().allMatch(e -> e.getGender().equals("Male"));
        System.out.println(allFemale);

        boolean noneMale = employees.stream().noneMatch(e -> e.getGender().equals("Male"));
        System.out.println(noneMale);

        //limit
        List<Employee> limitedEmployees = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());

        System.out.println(limitedEmployees);

        // skip
        List<Employee> limitedEmployeesWithSkip = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(3).limit(3).collect(Collectors.toList());

        System.out.println(limitedEmployeesWithSkip);

        String name = "Priyanshi Parashar";

        String[] nameArr = name.split(" ");

        name = nameArr[1]+" "+ nameArr[0];
        System.out.println(name);

        int[] original = {1, 2, 3};
        Arrays.stream(original).forEach(System.out::println);

        Runnable task = () -> System.out.println("jewe ");
        task.run();

        Predicate<Employee> p = (employeeList) -> employeeList.getProjects().stream().count() > 10;
        p.test(employees.get(0));
    }
}
