package oops6_interface;
//Note: abstract methods in an interface must be implemented by a concrete class,You can not create object of interface directly.
//the implemented method in the concrete class is called using an instance of the class.

public class DemoClass1 implements DemoInterface_1,DemoInterface_2 {
	int k=90;
public void add()
{
	System.out.println("run method from interface1");
}
public int addition()

{
	int result=10;
	System.out.println("run method from interface2");
	return result;
	
}
	public static void main(String[] args) {
		DemoClass1 obj1 = new DemoClass1();
		obj1.add();		
		DemoInterface_1.disp();
		obj1.addition();
		DemoInterface_2.address();
		
		
	}

}
