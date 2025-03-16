package oops_this_keyword;

//this keyword can also be used inside Methods to call another Method from same Class.

public class MethodCall {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.i = 10;
		obj.method1();

	}

}

class Child extends MethodCall {
	int i;

	void method1() {
		this.method2(); //inside Methods to call another Method
	}

	void method2() {
		System.out.println(i);
	}
}
