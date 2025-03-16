
/*
 * Variables (Fields)
 * Variable is named memory location which can hold data and the data can change any number of times during execution. It is also an identifier in java.
 *int i;  //Declaration
 *i=10;  //Initialization
 *int i=10;  //both Declaration and Initialization
 *"Local variable": Variable which is declared within a method or block.
			Before utilize local variable it should be initialized, otherwise it will give compile time error.
 *"Global variable": Variable which is declared within a class and outside of any method or a block.
            Declaration and initialization should be done in same line. 
            If you are utilizing without initialization it will take default value.
            global variable contains both static and non-static.
            */
package _01_Basics;

public class Variable__Global_Local {
	// In class level all are Global variable
	// global variable contains both static and non-static

	int a = 10; // non-static variable/instance variable
	static int b = 20; // static variable/class variable

	public static void main(String[] args) {

		int x = 48; // local variable

		System.out.println(x);
		System.out.println(b); // or System.out.println(Variable__Global_Local.b);

		Variable__Global_Local obj = new Variable__Global_Local();
		System.out.println(obj.a); // non static variable call through object of that class

	}

}
