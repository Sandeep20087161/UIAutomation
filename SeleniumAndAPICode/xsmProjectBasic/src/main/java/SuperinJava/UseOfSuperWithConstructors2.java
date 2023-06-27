package SuperinJava;

public class UseOfSuperWithConstructors2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child = new ChildClass();
        // calls child implementation
        // of isTrue()
        boolean result = child.isTrue();
 
        // prints "false"
        System.out.println(result);
	}

}
