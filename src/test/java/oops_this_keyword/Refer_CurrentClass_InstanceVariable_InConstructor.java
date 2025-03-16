package oops_this_keyword;

//this : to refer current class instance variable- 
//if current class instance variable name same as parameters passed in constructor,
//to solve ambiguity problem and initialize instance variable using parameterized constructor.

public class Refer_CurrentClass_InstanceVariable_InConstructor {
    
	//instance variable
	int num;
	String city;
	float marks;

	Refer_CurrentClass_InstanceVariable_InConstructor(int num, String city, float marks) //constructor
	{
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

Refer_CurrentClass_InstanceVariable_InConstructor obj = new Refer_CurrentClass_InstanceVariable_InConstructor(100, "Latur", 77.33f);
		obj.disp();

	}

}

