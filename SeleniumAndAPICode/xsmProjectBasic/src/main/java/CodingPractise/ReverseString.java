package CodingPractise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sandeep";
		String revString = "" ;
		
		for (int j=s.length()-1;j>=0;j--) {
			revString=revString+s.charAt(j);
		}
		
		System.out.println(revString);
	}

}
