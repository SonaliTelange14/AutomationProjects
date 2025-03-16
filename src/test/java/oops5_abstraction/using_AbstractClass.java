package oops5_abstraction;

abstract class using_AbstractClass {
	abstract void eat();
	abstract void speak();
	void run()
	{
		System.out.println("run all the animals");
	}

}
class Cat extends using_AbstractClass
{
	void eat()
	{
		System.out.println("eat fish");
	}
	void speak()
	{
		System.out.println("maew maew");
	}
	int add()
	{
		int a=20,b=30;
		System.out.println("print addition"+a+b);
		return a;
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.speak();
		c.add();
	}
}
class Dog extends using_AbstractClass
{
	void eat()
	{
		System.out.println("eat biscuit");
	}
	void speak()
	{
		System.out.println("bow bow");
	}
	
}
class Driver{
public static void main(String[] args) {
	Dog d = new Dog();
	d.eat();
	d.speak();
}
}