// Iterating HashMap using Lambda Expressions- forEach()
// Importing Map and HashMap classes
// from java.util package
package JavaPractices;
import java.util.HashMap;
import java.util.Map;

public class HashMapUsingLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating hash map
        Map<Character, String> charType
            = new HashMap<Character, String>();
 
        // Inserting elements(key-value pairs)
        // in the hash map ( Custom inputs)
        charType.put('A', "Apple");
        charType.put('B', "Basketball");
        charType.put('C', "Cat");
        charType.put('D', "Dog");
 /*
        // Iterating through forEach and
        // printing the elements
        charType.forEach(
            (key, value)
                -> System.out.println(key + " = " + value));
                */
	}

}
