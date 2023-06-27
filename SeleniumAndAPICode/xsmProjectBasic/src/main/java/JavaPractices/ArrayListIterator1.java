// Java program to demonstrate
// listIterator() method
// for String value
package JavaPractices;

import java.util.*;

public class ArrayListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of ArrayList<Integer>
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Apple");
		arrlist.add("Mango");
		arrlist.add("Banana");
		arrlist.add("Grapes");
		arrlist.add("Cherry");

		Iterator<String> i = arrlist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
