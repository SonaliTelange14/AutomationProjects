package oops6_interface;

public interface DemoInterface_1 {
	int a=10;
	void add(); //abstract method
	static void disp() //static concrete method 
	//(interface have static concrete methods,they directly call by interface name,not need to create object,
	//interface not able to create its object, and those static methods are not overridden  )
	{
		int b=10;
		System.out.println("run static(concrete method) from interface1: "+b);
	}
}
