package _13_StreamApi;

import java.util.*;
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

//        3. Find the first employee who earns more than 80,000 using findFirst().
        Optional<Employee> firstEmployee = employeeList.stream().filter(e -> e.getSalary() > 80000).collect(Collectors.toList()).stream().findFirst();

        System.out.println(firstEmployee);

//        Intermediate Operations
//        4. Extract a list of all unique project names from the employee list using flatMap() and distinct().

        List<String> projects = employeeList.stream().flatMap(e -> e.getProjects().stream().map(p -> p.getName())).distinct().collect(Collectors.toList());

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
        Map<String, List<Employee>> deptEmps = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));

        System.out.println(deptEmps);

//        21. Create a map where the key is the employee's name and the value is the number of projects they are working on.
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

        Map<String, Double> deptAndSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(e -> e.getSalary())));

        Optional<Map.Entry<String, Double>> maxSalaryDept = deptAndSalary.entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(maxSalaryDept);

//        30. For each department, list the highest-paid employee.

        Map<String, Optional<Employee>> highestPaidInDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))));

        System.out.println(highestPaidInDept);

//        31. For each project, find the employees working on it.
        Map<String, List<Project>> empsWithProjects = employeeList.stream().flatMap(e->e.getProjects().stream()).collect(Collectors.groupingBy(Project::getName));

    }
}
