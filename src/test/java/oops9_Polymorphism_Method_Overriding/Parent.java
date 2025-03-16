package oops9_Polymorphism_Method_Overriding;

public class Parent {
	int a=90;
	void display()
	{
		System.out.println("Parent class method");
		System.out.println(a);
	}
	String address(String city, String district)
	{
		System.out.println("parent class method:-city: "+city+" district: "+district);
		return city;
	}

}
