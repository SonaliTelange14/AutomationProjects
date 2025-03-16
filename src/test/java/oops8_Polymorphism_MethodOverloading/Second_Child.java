package oops8_Polymorphism_MethodOverloading;

public class Second_Child extends First {
	static void addition(int a, int b,float s)
	{
		float result3=a+b+s;
		System.out.println("result3: "+result3);
	}
	public void  addition(double d, long l)
	{
		double result4=d+l;
		System.out.println("result4: "+result4);
	}
public static void main(String[] args) {
	Second_Child obj1 = new Second_Child();
	obj1.addition(2, 10, 20.3f);
	obj1.addition(34.4, 678l);}
}
