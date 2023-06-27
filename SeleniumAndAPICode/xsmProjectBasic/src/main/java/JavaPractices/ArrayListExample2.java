package JavaPractices;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Array of string type
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to ArrayList
		// Custom inputs
		al.add("Geeks");
		al.add("Geeks");

		// Here we are mentioning the index
		// at which it is to be added
		al.add(1, "For");

		// Printing all the elements in an ArrayList
		System.out.println(al);

		// Setting element at last index
		al.set(2, "For");
		System.out.println("Updated ArrayList " + al);

		// Removing element from above ArrayList
		al.remove(1);
		// Printing the updated Arraylist elements
		System.out.println("After the Index Removal " + al);
		al.add("Geeks");
		System.out.println("Adding Geeks" + al);

		al.remove("Geeks");

		// Now printing updated ArrayList
		System.out.println("After the Object Removal " + al);

		al.remove("Geeks");

		// Now printing updated ArrayList
		System.out.println("After the Object Removal " + al);

	}
}

/*
 * [Geeks, For, Geeks] 
 * Updated ArrayList [Geeks, For, For] 
 * After the Index Removal [Geeks, For] 
 * Adding Geeks[Geeks, For, Geeks]
 *  After the Object Removal [For, Geeks]
 *   After the Object Removal [For]
 */

