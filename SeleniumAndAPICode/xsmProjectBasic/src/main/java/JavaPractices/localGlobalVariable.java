package JavaPractices;

public class localGlobalVariable {
	static int a=10;
	
	public static void main(String[] args) {
		System.out.println("outside local method"+a);
		new localGlobalVariable().localMethod();
		System.out.println("outside local method"+a);
		
	}
	public void localMethod() {
		a=5;
		System.out.println("inside local method"+a);
	}
}

/*
 * outside local method10
 *  inside local method5 
 *  outside local method5
 */
