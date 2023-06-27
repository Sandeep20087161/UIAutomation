package SuperinJava;

public class ChildClass extends ParentClass{
	 public boolean isTrue()
	    {
	        // calls parent implementation of isTrue()
	        boolean parentResult = super.isTrue();
	        // negates the parent result
	        return !parentResult;
	    }
}
