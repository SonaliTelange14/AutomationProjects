package oops1_inheritance_SingleLevel;

public class Child extends Parent {
	int mark=30;
	int grade(int mathsMark)
	{
		this.mark=mathsMark;
		return mark;
	}
public static void main(String[] args) {
	Child obj3=new Child();
	obj3.grade(100);
	System.out.println(obj3.mark);
	obj3.add();
	obj3.disp();
}
}

