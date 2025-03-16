package _05_Constructor;

public class ParameterizedConstructor {
	int n1;
	int n2;
	String name;

	ParameterizedConstructor(int a, int b, String n) {
		n1 = a;
		n2 = b;
		name=n;
	}

	void disp() {
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(20, 40,"monali");
		obj.disp();
		

	}

}
