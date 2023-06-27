package InheritanceConcept;

public class TestClass {

	public static void main(String[] args) {

		ParentClass p = new ParentClass();
		p.loan();
		p.payments();
		p.mortgages();
		p.savings();

		// Static polymorphism/Compile time polymorphism 
		childClass c = new childClass();
		c.loan();
		c.payments();
		c.mortgages();
		c.transaction();

		// Top Casting allowed //Dynamic polymorphism//Run time polymorphism
		ParentClass p1 = new childClass();
		p1.loan();
		p1.payments();
		p1.mortgages();
		// p1.transaction(); not allowed p1.savings();

		// DownCasting not allowed//java.lang.ClassCastException
		childClass c1 = (childClass) new ParentClass();
		c1.loan();// java.lang.ClassCastException
		c1.transaction();// java.lang.ClassCastException
	}

}
