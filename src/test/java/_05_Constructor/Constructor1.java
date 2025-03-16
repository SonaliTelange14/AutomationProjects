
package _05_Constructor;
//Constructors are definition blocks in java which is used to :

//1. Used to initialize non-static variables.
//2. Used to create an object

public class Constructor1 {
	// non-static variables, here only declaration done of a and b
	int a;
	int b;

	Constructor1() {
		// 1. used to initialize non-static variables a and b
		a = 20;
		b = 30;
	}

	public static void main(String[] args) {

		// 2. Used to create an object
		Constructor1 obj = new Constructor1();
		
		System.out.println("a:" + obj.a);
		System.out.println("b:" + obj.b);
	}

}
