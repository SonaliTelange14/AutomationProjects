package Number_InterviewProgram;

public class _13_SwapTwoNumbers__UsingThirdVariable {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int temp;
		
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
