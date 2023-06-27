package CodingPractise;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("delhi");
		ar.add("mumbai");
		ar.add("kolkata");
		ar.add("chennai");
		
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		ar.add("delhi");
		System.out.println(ar);
		ar.add(null);
		System.out.println(ar);
		ar.add(null);
		System.out.println(ar);

	}

}
