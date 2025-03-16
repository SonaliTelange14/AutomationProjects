package oops8_Polymorphism_MethodOverloading;

public class First {
	int a;
	int b;
	void addition(int a, int b)
	{
		this.a=a;
		this.b=b;
	int result=a+b;
	System.out.println("result1: "+result);
	}
	int addition(int a, int b, int c)
	{
		int result2=a+b+c;
		System.out.println("result2: "+result2);
		return result2;
	}
	public static void main(String[] args) {
		First obj= new First();
		obj.addition(3,2);
		System.out.println("a: "+obj.a);
		System.out.println("b: "+obj.b);
		obj.addition(9, 90, 1);
	}

}
