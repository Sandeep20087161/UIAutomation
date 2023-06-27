/*Use the static variable for the property that is common to all objects. For example, in class Student, all students share the same college name. Use static methods for changing static variables.

Consider the following java program, that illustrates the use of static keywords with variables and methods.*/
package JavaPractices;

public class StaticKeyWordWhenToUse {
	 String name;
	    int rollNo;
	 
	    // static variable
	    static String cllgName;
	 
	    // static counter to set unique roll no
	    static int counter = 0;
	 
	    public StaticKeyWordWhenToUse(String name)
	    {
	        this.name = name;
	 
	        this.rollNo = setRollNo();
	    }
	 
	    // getting unique rollNo
	    // through static variable(counter)
	    static int setRollNo()
	    {
	        counter++;
	        return counter;
	    }
	 
	    // static method
	    static void setCllg(String name) { cllgName = name; }
	 
	    // instance method
	    void getStudentInfo()
	    {
	        System.out.println("name : " + this.name);
	        System.out.println("rollNo : " + this.rollNo);
	 
	        // accessing static variable
	        System.out.println("cllgName : " + cllgName);
	    }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // calling static method
        // without instantiating Student class
		StaticKeyWordWhenToUse.setCllg("XYZ");
 
		StaticKeyWordWhenToUse s1 = new StaticKeyWordWhenToUse("Alice");
		StaticKeyWordWhenToUse s2 = new StaticKeyWordWhenToUse("Bob");
 
        s1.getStudentInfo();
        s2.getStudentInfo();
	}

}
