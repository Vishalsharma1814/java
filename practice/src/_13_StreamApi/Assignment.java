package _13_StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
//        Stream Creation and Basic Operations

//        1. Create a list of employee names using map().
        List<String> employeeName = employeeList.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(employeeName);

//        2. Filter out employees from the "Development" department and print their details.
        List<Employee> developmentEmployees = employeeList.stream().filter(e -> e.getDept().equals("Development")).collect(Collectors.toList());

        System.out.println(developmentEmployees);

//        employeeList.stream().filter(e -> e.getDept().equals("Development")).collect(Collectors.toList());

//        3. Find the first employee who earns more than 80,000 using findFirst().
        Optional<Employee> firstEmployee = employeeList.stream().filter(e -> e.getSalary() > 80000).collect(Collectors.toList()).stream().findFirst();

        System.out.println(firstEmployee);
        employeeList.stream().filter(e -> e.getSalary() > 80000).collect(Collectors.toList()).stream().findFirst();

//        Intermediate Operations
//        4. Extract a list of all unique project names from the employee list using flatMap() and distinct().

        List<String> projects = employeeList.stream().flatMap(e -> e.getProjects().stream().map(p -> p.getName())).distinct().collect(Collectors.toList());

        employeeList.stream().flatMap(e -> e.getProjects().stream().map(p -> p.getName())).distinct().collect(Collectors.toList());
        System.out.println(projects);

//        5. Get a list of employees whose name starts with "J".
        List<Employee> jEmployees = employeeList.stream().filter(e -> e.getName().startsWith("J")).collect(Collectors.toList());

        System.out.println(jEmployees);

//        6. Sort the employees by their salary in ascending order.
        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

        System.out.println(sortedEmployees);

//        7. Sort the employees by their name alphabetically and then by salary in descending order.
        List<Employee> sortByNameAndSalary = employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getName).thenComparingDouble(Employee::getSalary))).collect(Collectors.toList());

        System.out.println(sortByNameAndSalary);

//        8. Filter employees with a salary greater than 75,000 and collect their names into a List.
        List<String> employeesResult = employeeList.stream().filter(e -> e.getSalary() > 75000).map(em -> em.getName()).collect(Collectors.toList());

        System.out.println(employeesResult);

//        9. Group employees by their department using Collectors.groupingBy().
        Map<String, List<Employee>> deptEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(deptEmployees);

//        10. Partition employees into two groups: those who earn more than 75,000 and those who don't using partitioningBy().
        Map<Boolean, List<Employee>> partitionOfEmps = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 75000));

        System.out.println(partitionOfEmps);

//        11. Check if all employees in the "Development" department have a salary greater than 70,000 using allMatch().
        Boolean allMatchOrNot = employeeList.stream().allMatch(e -> e.getSalary() > 70000);

        System.out.println(allMatchOrNot);

//        12. Check if any employee belongs to the "Finance" department using anyMatch().

        Boolean ifFinance = employeeList.stream().anyMatch(e -> e.getDept().equals("Finance"));

        System.out.println(ifFinance);

//        13. Verify if no employee earns less than 50,000 using noneMatch().

        Boolean salaryCheck = employeeList.stream().noneMatch(e -> e.getSalary() < 50000);

        System.out.println(salaryCheck);

//        14. Count the number of employees in the "Sales" department.
        long empCount = employeeList.stream().filter(e -> e.getDept().equals("Sales")).count();

        System.out.println(empCount);

//        15. Find the employee with the maximum salary using max() and Comparator.comparingDouble().

        Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparing(e -> e.getSalary()));

        System.out.println(maxSalary);

//        16. Find the employee with the minimum salary using min() and Comparator.comparingDouble().
        Optional<Employee> minSalary = employeeList.stream().min(Comparator.comparing(e -> e.getSalary()));

        System.out.println(minSalary);

//        Collecting and Reducing
//        17. Calculate the total salary of all employees using reduce().

        Double totalSalary = employeeList.stream().map(e -> e.getSalary()).reduce(00.0, Double::sum);

        System.out.println(totalSalary);

//        18. Find the average salary of employees using Collectors.averagingDouble().
        Double averageSalary = employeeList.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));

        System.out.println(averageSalary);

//        19. Get a comma-separated string of all employee names using Collectors.joining().
        String names = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(" ,"));

        System.out.println(names);

//        20. Create a map where the key is the department and the value is a list of employees in that department.

        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));


        Map<String, List<Employee>> deptEmps = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));

        System.out.println(deptEmps);

//        21. Create a map where the key is the employee's name and the value is the number of projects they are working on.
        employeeList.stream().collect(Collectors.toMap(Employee::getName, e -> e.getProjects().stream().count()));


        Map<String, Integer> nameAndProject = employeeList.stream().collect(Collectors.toMap(Employee::getName, e -> e.getProjects().size()));

        System.out.println(nameAndProject);

//        22. Extract all unique client names from the projects associated with employees.
        List<String> clients = employeeList.stream().flatMap(e -> e.getProjects().stream().map(p -> p.getClient())).distinct().collect(Collectors.toList());

        System.out.println(clients);

//        23. List the names of employees working on projects led by "Alice".
        List<String> aliceManagedEmployees = employeeList.stream().filter(e -> e.getProjects().stream().anyMatch(p -> p.getBuLeadName().equals("Alice"))).map(emp -> emp.getName()).collect(Collectors.toList());

        System.out.println(aliceManagedEmployees);

//        24. Get the top 3 highest-paid employees.

        List<String> topThreePaid = employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(e -> e.getSalary()))).limit(3).map(emp -> emp.getName()).collect(Collectors.toList());

        System.out.println(topThreePaid);

//        25. Skip the first 3 employees in the list and collect the rest into a List.

        List<String> excludeThree = employeeList.stream().skip(3).map(e -> e.getName()).collect(Collectors.toList());

        System.out.println(excludeThree);

//        26. Group employees by gender and find the average salary for each gender.
        Map<String, Double> avgGenderSalary = employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())));

        System.out.println(avgGenderSalary);

//        27. List the names of all employees grouped by the client they are working for.
        Map<String, List<String>> empAndClient = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.flatMapping(e -> e.getProjects().stream().map(p -> p.getClient()), Collectors.toList())));

        System.out.println(empAndClient);

//        28. Find the employee(s) with the highest number of projects.

        int val = employeeList.stream().mapToInt(e -> e.getProjects().size()).max().orElse(0);

        List<Employee> maxProjects = employeeList.stream().filter(e -> e.getProjects().size() == val).collect(Collectors.toList());

        System.out.println(maxProjects);

//        29. Find the department with the highest total salary.

        Optional<Map.Entry<String, Double>> deptAndSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(e -> e.getSalary()))).entrySet().stream().max(Comparator.comparingDouble(e -> e.getValue()));

        System.out.println(deptAndSalary);

//        30. For each department, list the highest-paid employee.

        Map<String, Optional<Employee>> highestPaidInDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))));

        System.out.println(highestPaidInDept);

//        31. For each project, find the employees working on it.
        Map<String, List<Employee>> employeesByProject = employeeList.stream().flatMap(employee -> employee.getProjects().stream() // Flatten the projects for each employee
                        .map(project -> new ProjectEmployeePair(project.getName(), employee))) // Create a pair of project name and employee
                .collect(Collectors.groupingBy(ProjectEmployeePair::getProjectName, Collectors.mapping(ProjectEmployeePair::getEmployee, Collectors.toList())));

        System.out.println(employeesByProject);

//        32. Filter the employees who work on projects for "ABC Corp" and have a salary above 70,000.
        List<Integer> abcClientEmps = employeeList.stream().filter(e -> e.getProjects().stream().map(pr -> pr.getClient()).collect(Collectors.toList()).contains("ABC Corp")).map(Employee::getId).collect(Collectors.toList());
        System.out.println(abcClientEmps);


//        33. Find the total salary of all employees working in the "Development" department.

        double totalSalaryInDev = employeeList.stream().filter(emp -> emp.getDept().equals("Development")).map(em -> em.getSalary()).reduce(0.00, Double::sum);

        System.out.println(totalSalaryInDev);

//        34. Create a list of all project codes for employees whose salary is below 60,000.

        List<String> projectCodes = employeeList.stream().filter(e -> e.getSalary() > 60000).flatMap(p -> p.getProjects().stream()).map(pr -> pr.getProjectCode()).collect(Collectors.toList());

        System.out.println(projectCodes);
//        35. Identify the gender distribution in each department.
        Map<String, Map<String, Long>> genderDistributionByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        System.out.println(genderDistributionByDepartment);


//        36. Find the most frequently assigned project lead across all employees.

        List<String> projectLeads = employeeList.stream().flatMap(e -> e.getProjects().stream().map(pr -> pr.getBuLeadName())).collect(Collectors.toList());
        String mostFrequentName = projectLeads.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting())) // Group by name and count occurrences
                .entrySet().stream() // Convert the map to a stream
                .max(Map.Entry.comparingByValue()) // Find the entry with the maximum value (occurrences)
                .map(Map.Entry::getKey) // Get the key (name) of the entry
                .orElse(null);
        System.out.println(mostFrequentName);
//        37. Use peek() to log employee details while filtering those with salaries over 90,000.

        List<Employee> filteredEmps = employeeList.stream().filter(e -> e.getSalary() > 90000).peek(emp -> System.out.println("After filter: " + emp)).collect(Collectors.toList());

        System.out.println(filteredEmps);
//        38. Find the top 2 departments with the highest number of employees.
//        39. List all employees who are working on more than 2 projects.
//        40. Generate a summary of salaries (count, sum, min, average, max) using Collectors.summarizingDouble().


//        Category: filter()

//        Find all employees in the "Development" department.
        employeeList.stream().filter(e -> e.getDept().equals("Development")).forEach(System.out::println);
//        List employees whose salary is greater than 80,000.
//        Find all female employees working in the "Sales" department.
//        Get a list of employees who are working on more than 2 projects.
//        Find all employees who are working under a specific project leader, e.g., "Alice".

//        Category: map()
//        Create a list of employee names.
//        Create a list of all project names across all employees.
//        Map each employee to their department and salary as a formatted string (e.g., Development - $80,000).
//        Convert the list of employees into a list of EmployeeDTO objects with only name and salary.
//        Get the uppercase version of all employee names.

//        Category: reduce()
//        Calculate the total salary of all employees.
//        Find the highest salary among employees.
//        Calculate the sum of the length of all employee names.
//        Concatenate all employee names into a single string, separated by commas.
//        Find the minimum salary using reduce().


//        Category: collect()
//        Group employees by their department.
//        Partition employees into two groups: those earning more than 75,000 and those earning less or equal.
//        Create a map where the key is the department name, and the value is the list of employees in that department.
//        Collect all unique project names into a Set.
//        Create a Map with the employee's name as the key and the list of project names as the value.


//        Category: sorted()
//        Sort employees by their names in ascending order.
//        Sort employees by their salary in descending order.
//        Sort employees by department, and then by name within each department.
//        Create a list of employees sorted by the number of projects they are working on.
//        Sort projects alphabetically by their name.


//        Category: flatMap()
//        Get a list of all unique project names across all employees.
//        Create a list of all project leaders' names from the projects of all employees.
//        Find all clients for whom employees are working.
//        List all project names paired with the employees working on them.
//        Get a list of all project codes across all employees.


//        Category: distinct()
//        Find all unique department names.
//        List all unique project names employees are working on.
//        Get the distinct names of project leaders.
//        Find all unique clients across all projects.
//        Get a distinct list of salaries of employees.


//        Category: anyMatch() / allMatch() / noneMatch()
//        Check if any employee is earning more than 1,00,000.
//        Verify if all employees in the "Finance" department are earning more than 50,000.
//        Check if no employee in the "HR" department earns less than 40,000.
//        Verify if any employee is working on a project with the name "Alpha".
//        Check if all employees have at least one project assigned to them.


//        Category: count()
//        Count the number of employees in the "Development" department.
//        Find the total number of employees earning more than 75,000.
//        Count the number of projects led by "Alice".
//        Calculate the number of employees who are working in the "Marketing" department.
//        Count the number of unique departments in the company.


//        Category: findFirst() / findAny()
//        Find the first employee in the "Sales" department.
//        Get any employee earning more than 90,000.
//        Find the first employee whose name starts with "J".
//        Retrieve any employee who is working on the "Zeta" project.
//        Get the first employee in the sorted list by salary.

//        Category: Advanced Combination
//        (filter + map): Find the names of employees who are earning more than 80,000.
//        (flatMap + filter): List the names of employees working on projects led by "Alice".
//        (collect + groupingBy): Group projects by their client and list all projects under each client.
//        (reduce + map): Calculate the total length of all employee names.
//        (filter + distinct + collect): Find all unique project leaders for projects worked on by employees in the "Development" department.
        System.out.println(employeeList.stream().filter(e-> e.getDept().equals("Development")).flatMap(emp -> emp.getProjects().stream().map(p -> p.getBuLeadName())).distinct().collect(Collectors.toList()));


//        Category: Miscellaneous
//        Create a comma-separated string of all employee names.
//        System.out.println(employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(", ")));

//        Find the employee(s) with the second-highest salary.
//        List<Employee> se = employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(Employee::getSalary))).skip(1).limit(1).collect(Collectors.toList());

//        System.out.println(se);
//        Get a list of all employees grouped by the first letter of their names.
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(e -> e.getName().charAt(0), Collectors.toList())));
//        Create a Map where the key is the employee ID, and the value is their total number of projects.
//        System.out.println(employeeList.stream().collect(Collectors.toMap(e -> e.getId(), emp -> emp.getProjects().size())));
//        Calculate the average salary of employees in each department.

//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary))));
    }

    static class ProjectEmployeePair {
        private String projectName;
        private Employee employee;

        public ProjectEmployeePair(String projectName, Employee employee) {
            this.projectName = projectName;
            this.employee = employee;
        }

        public String getProjectName() {
            return projectName;
        }

        public Employee getEmployee() {
            return employee;
        }
    }

//
//    Week 1-2: Core Java
//
// - Basic Syntax: Data types, operators, loops (for, while, do-while)
//            - OOP Concepts: Classes, objects, inheritance, polymorphism, encapsulation, abstraction
// - Collections Framework: List, Set, Map, Queue, Iterator, etc.
// - Exception Handling: Try-catch, custom exceptions, multi-catch
//            - File I/O: Reading/writing files using java.io and java.nio
// - Java 8+ Features: Lambdas, Streams, Optional, Functional Interfaces
// - Multithreading: Threads, Runnable, ExecutorService, Future, and basic synchronization
//
//    Week 3-4: Advanced Java & JDBC
//
// - JVM Internals: ClassLoader, JIT, memory management, garbage collection
// - Generics: Usage and wildcards
// - Design Patterns: Singleton, Factory, Strategy, Observer, Dependency Injection (Intro)
// - JDBC: Connecting with databases (CRUD operations), PreparedStatement, Connection pooling
//
//    Week 5-6: Spring Framework (Basics)
//
// - Spring Core
// - Dependency Injection (DI) and Inversion of Control (IoC)
//            - Beans, Scopes, and Bean Life Cycle
// - Autowiring and Spring Annotations
// - Spring AOP: Aspect-Oriented Programming fundamentals
// - Spring Data JPA: Basic CRUD operations with JPA
// - Entities, Repositories, and Custom Queries
//
//    Week 7: Spring Boot (Basics)
//
// - Spring Boot Fundamentals: Understanding the Spring Boot architecture
// - REST API creation
// - Spring Boot Annotations (@RestController, @RequestMapping, etc.)
// - Running a Spring Boot application
// - Spring Boot Auto Configuration: Application properties and profiles
// - Spring Boot with Database: Integrate Spring Boot with MySQL using Spring Data JPA
//
//    Week 8: Spring Boot (Advanced)
//
// - Security: Introduction to Spring Security (Basic Authentication)
// - Advanced Spring Boot Features: Exception handling (@ControllerAdvice)
// - Logging with Spring Boot
// - Pagination and Sorting
// - Testing: Write unit tests using JUnit and Mockito in Spring Boot

    public static void firstNonRepeatedChar(String input) {
        String a = Arrays.stream(input.split("")).map(e -> e.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println(a);
    }
}
