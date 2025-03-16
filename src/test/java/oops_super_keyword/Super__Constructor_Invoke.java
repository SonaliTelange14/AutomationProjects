package oops_super_keyword;

class Company {
	int id;
	String name;
	float salary;

	Company(int id, String name, float income) {
		this.id = id;
		this.name = name;

		salary = income; // current class variable name not same to constructor variable,so not use this
							// keyword

	}
}

class Employee extends Company {
	String city;
	long emp_code;

	Employee(int id, String name, float income, String city, long code) {
		super(id, name, income);
		this.city = city;
		emp_code = code;

	}

	void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("income: " + salary);
		System.out.println("city: " + city);
		System.out.println("code: " + emp_code);
	}
}

public class Super__Constructor_Invoke {

	public static void main(String[] args) {
		Employee obj = new Employee(203, "Ram mulani", 40000, "pune", 10);
		obj.display();
	}

}
