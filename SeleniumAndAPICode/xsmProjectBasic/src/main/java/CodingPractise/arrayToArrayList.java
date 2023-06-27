package CodingPractise;


import java.util.*;

public class arrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"1","2","3","4"};
		
		/*
		 * ArrayList<String> ar= new ArrayList<String>(); for(int i =0;i<a.length;i++)
		 * { ar.add(a[i]); } System.out.println(ar);
		 */
		  
		/* List<String> al = new ArrayList<String>(Arrays.asList(a)); */
		ArrayList<String> ar= new ArrayList<String>();
		Collections.addAll(ar, a);
		 
	}

}
