package _03_typecating;
//downcasting is converting upcasted object to behave like subclass object
//then this downcasted object aceess memebers of parent class and child class both.

class Super1 {
	void addition() {
		System.out.println("method of super class");
	}
}

class Sub1 extends Super1 {
	void substraction() {
		System.out.println("method of sub class");
	}
}
public class DerivedTypecasting_2_DownCasting {
	public static void main(String[] args) {
		/* ------------------------------------------------------------------------------
		 * 1-
		 * direct downcasting is not possible will get Compile Time Error 
		 * Super1 obj1=new Super1();
		 *  Sub1 obj2=obj1;
		 */
		/*2-
		 * Explicit downcasting is not possible, will get Class Cast Exception 
		 * Sub1 obj2=(Sub1)new Super1();
		 *---------------------------------------------------------------------------------*/
		
		//only upcasted object convert into child class object to achieve downcasting
		//upcasted object should be explicitly specified using cast operator ()
		
		//step 1: upcasting
		Super1 obj1=new Sub1();
		
	    //step 2: downcast upcasted object using upcast opeartor
		Sub1 obj2 = (Sub1)obj1;
		obj2.addition();
		obj2.substraction();
	}
	

}
