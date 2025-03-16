package oops6_interface;

public interface DemoInterface_2 {
	
	String b="Hello";
	int addition(); //abstract method
	static String address() //static concrete method
	{
	
		String city = "pune";
		System.out.println("run static(concrete method) from interface2: "+city);
		return city; 
	}
	
}
