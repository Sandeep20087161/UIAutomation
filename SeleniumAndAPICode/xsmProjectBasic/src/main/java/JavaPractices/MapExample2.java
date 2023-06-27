// Java program to demonstrate
// the working of Map interface
package JavaPractices;
import java.util.*;
public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Initialization of a Map
        // using Generics
        Map<Integer, String> hm1
            = new HashMap<Integer, String>();
  
        // Inserting the Elements
        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "Geeks");
        hm1.put(new Integer(3), "Geeks");
  
        System.out.println("Initial Map " + hm1);
  
        hm1.put(new Integer(2), "For");
  
        System.out.println("Updated Map " + hm1);
	}

}
