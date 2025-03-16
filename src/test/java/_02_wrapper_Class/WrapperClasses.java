package _02_wrapper_Class;

public class WrapperClasses {
	/*primitive data type-its wrapper class
	 -----------------
	 #Number class:
	 *short-Short
	 *byte-Byte
	 *int-Integer
	 *long-Long
	 *float-Float
	 *double-Double
	 ----------------
	 #Boolean class
	 *boolean-Boolean
	 ----------------
	 #Character class
	 *char-Character
	 ----------------
	 */
	public static void main(String[] args) {
		
	
	//boxing- convert primitive data type to its wrapper class(done implicitly)
	short s=20;
	Short s1=s;
	Short s2=new Short(s);
	
	System.out.println(s1);
	
	int n=300;
	Integer n1=n;
	System.out.println(n1);
	
	float f=30.33f;
	Float h=f;
	System.out.println(h);
	
	boolean b=true;
	Boolean b1=b;
	System.out.println(b1);
	
	char ch='d';
	Character ch1=ch;
	System.out.println(ch1);
	
	//unboxing- convert wrapper class to primitive data type(done explicitly)
	Integer i=12;
	int i1=i;
	System.out.println(i1);

	}
}
