package _05_Constructor;
//this : to refer current class instance variable- 
//if current class instance variable name same as parameters passed in constructor,
//to solve ambiguity problem and initialize instance variable using parameterized constructor.
public class Keyword_this {
	int num;
	String city;
	float marks;

	Keyword_this(int num, String city, float marks) {
		this.num=num;
		this.city=city;
		this.marks=marks;
	}

	void disp() {
		System.out.println("num:" + num);
		System.out.println("city:" + city);
		System.out.println("marks:" + marks);
	}

	public static void main(String[] args) {
		Keyword_this obj = new Keyword_this(100, "Latur", 77.33f);
		obj.disp();

	}

}
