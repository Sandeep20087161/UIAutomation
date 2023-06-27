//ArrayList Sort
package JavaPractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample5Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList();
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(2);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
		System.out.println();
		System.out.println(al.size());
		Collections.sort(al);
		for(Integer inte:al)
			System.out.print(inte);
	}
	


}
