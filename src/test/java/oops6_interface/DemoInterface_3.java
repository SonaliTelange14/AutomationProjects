package oops6_interface;

public interface DemoInterface_3 extends DemoInterface_1, DemoInterface_2
{
	//Just reuse abstract methods of another interfaces 
	void add();
	int addition();
	public static void main(String[] args) {
		//in an interface call only static concrete method using interface name
		DemoInterface_1.disp(); 
		DemoInterface_2.address();
		

	}
}
