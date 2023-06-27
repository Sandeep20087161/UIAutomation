// Java program to demonstrate working of Objectp[] toArray()
package JavaPractices;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");
	}
}

/*
 * Note: toArray() method returns an array of type Object(Object[]). We need to
 * typecast it to Integer before using as Integer objects. If we do not
 * typecast, we get compilation error.
 */
