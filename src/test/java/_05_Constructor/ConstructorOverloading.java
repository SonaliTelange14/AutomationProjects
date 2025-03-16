package _05_Constructor;
//Constructor Overloading:
//When we have more than one constructor for a class we call it as constructor overloading.
//Note: When you overload the constructor the "number of argument should be different" 
//OR "types of argument should be different" OR "sequence of argument should be different"

public class ConstructorOverloading {
	int n1;
	int n2;
	String str;
	long l;

	// overloading constructor below:
	ConstructorOverloading() {
		n1 = 20;
		n2 = 30;
		str = "ram";
		l = 5433333l;
	}

	ConstructorOverloading(int a, int b, String s, long k) {
		n1 = a;
		n2 = b;
		str = s;
		l = k;
	}

	ConstructorOverloading(int a, int b) {
		n1 = a;
		n2 = b;
	}

	ConstructorOverloading(String k, long s) {
		str = k;
		l = s;
	}

	ConstructorOverloading(String s) {
		str = s;
	}

	void disp() {
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		System.out.println("str:" + str);
		System.out.println("l:" + l);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		obj.disp();

		ConstructorOverloading obj1 = new ConstructorOverloading(10, 20, "AAA", 32323322l);
		obj.disp();

		ConstructorOverloading obj2 = new ConstructorOverloading(1000, 2000);
		obj2.disp();

		ConstructorOverloading obj3 = new ConstructorOverloading("bbbb", 987654l);
		obj3.disp();

		ConstructorOverloading obj4 = new ConstructorOverloading("cccccc");
		obj4.disp();
	}

}
