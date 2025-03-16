package _04_static_NonStatic__Members;

public class StaticMembers {
	// Non static initializor
	{
		System.out.println("1st Non static initializor called");
	}
	{
		System.out.println("2nd Non static initializor called");
	}

	// non static variable/instance variable
	int a = 320;

	// Non static method
	void disp() {
		System.out.println("Non static method calling");
	}

	public static void main(String[] args) {
		StaticMembers obj = new StaticMembers();
		System.out.println(obj.a);
		obj.disp();
		

	}

}
