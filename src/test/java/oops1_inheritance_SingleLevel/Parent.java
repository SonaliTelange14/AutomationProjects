package oops1_inheritance_SingleLevel;

public class Parent {
	int num1=99;
	int num2=100;
	int add()
	{
		int result=num1+num2;
		System.out.println(result);
		return result;
	}
	static void disp()
	{
		System.out.println("display method of parent class");
	}

}
