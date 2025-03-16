package oops_super_keyword;
//(1)Super keyword used for refer immediate parent class variable
//(2)Super keyword used to invoke parent class method
//(3)Super keyword used to invoke parent class constructor

class Parent{
	Parent()
	{
		System.out.println("parent class constructor");
	}
	Parent(int id)
	{
		System.out.println("parent class parameterzied constructor");
	}
	String color="black";
	void eating()
	{
		System.out.println("method of parent class - Eat");
	}
	int count()
	{
		int a=20;
		System.out.println("method of parent class-count");
		return a;
	}
	
}
class Child extends Parent
{
	Child()
	{
		/*
		 * super(); -->in each class by default super() is added implicitly by compiler 
		 * (for only without parameter constructor 
		 * and if there is no super() or this already present), 
		 * only if parameterized constructor is not present, if present
		 * then not call multiple super() in single constructor
		 */
	    super(30); //(3)Super keyword used to invoke parent class constructor
	
		System.out.println("child class constructor");
	}
	String color="green";
	void printcolor()
	{
		System.out.println("color of child: "+color);
		System.out.println("color of parent: "+ super.color); //(1)Super keyword used for refer immediate parent class variable
	}
	
	void eat()
	{
		System.out.println("method of child class - Eat");
	}
	void play()
	{
		System.out.println("method of child class - play");
	}
	void work()
	{
		play();
		eat();
		super.eating(); //(2)Super keyword used to invoke parent class method
		super.count();
	}
}
public class Super__Keyword {
	public static void main(String[] args) {
		
	
	Child ch = new Child();
	ch.printcolor();
	
	ch.work();
	}
}
