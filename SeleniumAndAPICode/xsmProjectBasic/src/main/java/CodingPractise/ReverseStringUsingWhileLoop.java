package CodingPractise;

public class ReverseStringUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Sandeep";
		int i=S.length()-1;
		while(i>=0) {
			System.out.print(S.charAt(i));
			i--;
		}
	}

}
