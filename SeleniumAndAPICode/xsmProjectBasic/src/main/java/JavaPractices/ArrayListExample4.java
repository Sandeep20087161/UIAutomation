//Add Elements Between Two Numbers
package JavaPractices;
import java.io.*;
import java.util.*;
public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList();
	        list.add(1);
	        list.add(2);
	        list.add(4);
	        System.out.println(list);
	        // insert missing element 3
	        list.add(2, 3);
	        System.out.println(list);
	}

}
