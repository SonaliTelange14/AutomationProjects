package oops_this_keyword;



public class ReferCurrentClassInstaceVariable_InMethod {
	int a=20;
	void disp(int a)
	{
this.a=a;
	System.out.println("method"+a);
	}
	public static void main(String[] args) {
		
		ReferCurrentClassInstaceVariable_InMethod obj1=new  ReferCurrentClassInstaceVariable_InMethod();
	//System.out.println(obj1.a);
	obj1.disp(100);
		
	}


}
