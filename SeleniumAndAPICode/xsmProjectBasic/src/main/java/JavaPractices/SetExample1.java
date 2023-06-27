// Java Program to Demonstrate Working of Set by 
// Iterating through the Elements 
  
// Importing utility classes 
package JavaPractices;
import java.util.*;
public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating object of Set and declaring String type
        Set<String> hs = new HashSet<String>();
  
        // Adding elements to Set  
        // using add() method
  
        // Custom input elements 
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");
  
        // Iterating through the Set
        // via for-each loop 
        for (String value : hs)
  
            // Printing all the values inside the object 
            System.out.print(value + ", ");
          
        System.out.println();
        
        //printing through iterator
        Iterator<String> i = hs.iterator();
        
        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext())
  
            System.out.println(i.next());
    }
	}


