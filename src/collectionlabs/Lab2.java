package collectionlabs;

//Create a new List consisting of three Employee objects. Use generics to create

import java.util.ArrayList;
import java.util.List;

//your list. Now loop through the list (using the new for-each style) and print
//out some meaningful information about each object. Verify that no cast was
//necessary.

public class Lab2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        
        employees.add(new Employee("a101", "John Doe"));
        employees.add(new Employee("a102", "John Smith"));
        employees.add(new Employee("a101", "John Doe"));
        
        for (Employee employee : employees) {
            System.out.println(employee.getName());//VERIFIED
        }
        
    }
    
    
}
