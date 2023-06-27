package JavaPractices;

import java.util.*;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Arraylist of string type
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to ArrayList
		// using standard add() method
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "For");

		// Using the Get method and the
		// for loop
		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : al)
			System.out.print(str + " ");
	}
}
