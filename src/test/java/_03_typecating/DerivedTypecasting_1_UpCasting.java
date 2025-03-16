package _03_typecating;

//child class object behave like parent class object
//create child class object and store in parent class reference variable 
//so child class object behave like parent class object and access members in parent class only
//upasting is Automatic i.e implicitly done 

class Super {
	void display() {
		System.out.println("method of super class");
	}
}

class Sub extends Super {
	void test() {
		System.out.println("method of sub class");
	}
}

public class DerivedTypecasting_1_UpCasting {

	public static void main(String[] args) {
		System.out.println("super class object execution:");
		Super s1 = new Super();
		s1.display();

		Sub s2 = new Sub();
		System.out.println("sub class object execution:");
		s2.test();
		s2.display();
		
		//upcasting
		System.out.println("upcasting:");
		Super s3=new Sub();
		s3.display();
		

	}

}
