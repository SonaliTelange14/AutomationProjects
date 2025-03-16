package oops9_Polymorphism_Method_Overriding;

public class Child extends Parent {
	String str="Sonali";
	void display()
	{
		System.out.println("child class method");
		System.out.println(str);
	}
	String address(String city, String district)
	{
		System.out.println("child class method:-address: "+city+", "+district);
		return district;
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.address("hadapsar", "Pune");
				
	}

}
