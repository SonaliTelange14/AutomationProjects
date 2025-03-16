package _01_Basics;

public class Methods {
	// static method
	public static int addition(int a, int b) {
		int resultAdd = a + b;
		System.out.println("Run static method:" + resultAdd);
		return resultAdd;

	}

    //Non static method
	String display(String name, String address) {
		System.out.println("run non static method: " + name + " and " + address);
		return name;
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.display("Bhumi telange", "Pune"); // call parameterized Non static method
		
		Methods.addition(15, 10); // call parameterized static method

	}

}
