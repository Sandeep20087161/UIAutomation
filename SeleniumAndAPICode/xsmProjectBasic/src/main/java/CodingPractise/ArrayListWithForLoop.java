package CodingPractise;

import java.util.ArrayList;

public class ArrayListWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("delhi");
		ar.add("mumbai");
		ar.add("kolkata");
		ar.add("chennai");
		for(String str:ar) {
			System.out.println(str);
		}
	}

}
