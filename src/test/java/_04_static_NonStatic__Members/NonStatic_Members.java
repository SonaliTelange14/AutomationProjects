package _04_static_NonStatic__Members;

public class NonStatic_Members {
	// static initializer
	static {
		System.out.println("Static initializer called");
	}

	// static variable
	static int num = 100;

	// static method
	static int add() {
		int a = 20;
		int b = 30;
		int addition = a + b;
		System.out.println("static method called:"+addition);
		return addition;
	}

	public static void main(String[] args) {
		NonStatic_Members.add(); 
		System.out.println(NonStatic_Members.num);

	}

}
