package collectionlabs;
//  Create a new List consisting of one or more Employee objects, plus one or
//  more Dog objects. Do not use generics. Now loop through the list and print

import java.util.ArrayList;
import java.util.List;

//  out some meaningful information about each object. What challenges does
//  this present? How can you overcome these challenges?
public class Lab3 {
    public static void main(String[] args) {
        List objects = new ArrayList();
    
        objects.add(new Dog("Fido", "a"));
        objects.add(new Employee("a101", "John Doe"));
        objects.add(new Dog("Max", "b"));
    }
    
    
}
