package _13_StreamApi;

import java.util.Iterator;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();
        Iterator e = employees.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
