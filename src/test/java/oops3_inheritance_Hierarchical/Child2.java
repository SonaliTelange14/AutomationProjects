package oops3_inheritance_Hierarchical;

public class Child2 extends Parent {
	String name="guru";
public static void main(String[] args) {
	Child2 obj1=new Child2();
	obj1.disp("ram", "sita");
	System.out.println(obj1.s1+" "+obj1.s2);
	System.out.println(obj1.f);
	System.out.println(obj1.name);
			
}
}
