package oops2_inheritance_MultiLevel;

public class Child extends Parent {
	boolean b=true;
	double d=32.8;
	public static void main(String[] args) {
		Child obj2=new Child();
		System.out.println(obj2.k);
		System.out.println(obj2.s);
		System.out.println(obj2.b);
		System.out.println(obj2.d);
	}

}
