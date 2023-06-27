
// Java program to convert a ArrayList to an array
// using get() in a loop.
package JavaPractices;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class ArrayListToArrayUsingGetinLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> al = new ArrayList<Integer>();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);
	 
	        Integer[] arr = new Integer[al.size()];
	 
	        // ArrayList to Array Conversion
	        for (int i = 0; i < al.size(); i++)
	            arr[i] = al.get(i);
	 
	        for (Integer x : arr)
	            System.out.print(x + " ");
	    }
	}


