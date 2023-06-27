// Java program to demonstrate how to add
// one or more element(s) to returned
// resizable List.

package JavaPractices;

import java.util.*;

public class ArrayToArrayListUsingAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		List<String> al = new ArrayList<String>(Arrays.asList(geeks));
		System.out.println(al);

		// Adding some more values to the List.
		al.add("Shashank");
		al.add("Nishant");

		System.out.println("\nArrayList After adding two" + " more Geeks: ");
		System.out.println(al);
	}

}
