package oops3_inheritance_Hierarchical;

public class Child1 extends Parent {
long l=9439439424l;
short  s=4;
static String str="Pune";
public static void main(String[] args) {
	Child1 obj=new Child1();
	obj.disp("Sonali", "Telange");
	System.out.println(obj.s1+" "+obj.s2);
	System.out.println(obj.f);
	System.out.println(obj.s);
	System.out.println(obj.l);
	System.out.println(Child1.str);
}

}
