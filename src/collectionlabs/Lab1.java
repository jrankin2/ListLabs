package collectionlabs;

//  Using instructor samples as a guide, create a List (choose from Vector or

import java.util.ArrayList;
import java.util.List;

//  ArrayList) of your favorite hobby items, where each item is represented as a
//  String value. Do not use generics. Populate the list with at least three items.
//  Then loop through the list and print out the contents to the console. Don’t
//  forget to cast items as your retrieve them for output.

public class Lab1 {

    public static void main(String[] args) {
        List hobbies = new ArrayList();
        
        hobbies.add(new Hobby("Biking"));
        hobbies.add(new Hobby("Running"));
        hobbies.add(new Hobby("Walking"));
        
        for (Object obj : hobbies) {
            Hobby hobby = (Hobby)obj;
            System.out.println(hobby.getName());
        }
        
    }
}
