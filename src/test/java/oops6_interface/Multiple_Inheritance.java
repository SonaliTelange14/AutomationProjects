package oops6_interface;

//Declare the interfaces 
interface Walkable { 
	void walk(); 
	void swim();
} 

interface Swimmable { 
	void swim(); 
} 

//Implement the interfaces in a concrete class 
class Duck implements Walkable, Swimmable { 
	public void walk() 
	{ 
		System.out.println("Duck is walking."); 
	} 

	public void swim() 
	{ 
		System.out.println("Duck is swimming."); 
	} 
	
} 
public class Multiple_Inheritance {
	public static void main(String[] args) {
		
	//Use the class to call the methods from the interfaces 
	 
			Duck duck = new Duck(); 
			duck.walk(); 
			duck.swim(); 

	}
}
