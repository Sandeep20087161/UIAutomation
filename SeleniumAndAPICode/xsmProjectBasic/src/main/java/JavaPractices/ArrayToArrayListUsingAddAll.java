// Java program to demonstrate how to
// add all elements of array to arrayList.
package JavaPractices;

import java.util.*;

public class ArrayToArrayListUsingAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		List<String> al = new ArrayList<String>();

		// adding elements of array to arrayList.
		Collections.addAll(al, geeks);

		System.out.println(al);
	}

}
