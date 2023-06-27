package CodingPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("delhi");
		ar.add("mumbai");
		ar.add("kolkata");
		ar.add("chennai");
		Iterator<String> it=ar.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
