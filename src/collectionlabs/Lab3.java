package collectionlabs;
//  Create a new List consisting of one or more Employee objects, plus one or
//  more Dog objects. Do not use generics. Now loop through the list and print
//  out some meaningful information about each object. What challenges does
//  this present? How can you overcome these challenges?

import java.util.ArrayList;
import java.util.List;


public class Lab3 {
    public static void main(String[] args) {
        List objects = new ArrayList();
    
        objects.add(new Dog("Fido", "a"));
        objects.add(new Employee("a101", "John Doe"));
        objects.add(new Dog("Max", "b"));
        
        for (Object object : objects) {
            //rigid
            if(object instanceof Employee){
                Employee e = (Employee)object;
                System.out.println(e.getName());
            }else if(object instanceof Dog){
                Dog d = (Dog)object;
                System.out.println(d.getName());
            }
            
            //less rigid
            ListObject listObject = (ListObject)object;
            System.out.println(listObject.getName());
            
        }
        
    }
    
    
}
