package Number_InterviewProgram;

public class _14_SwapTwoNumbers__WithoutUsingThirdVariable {

	public static void main(String[] args) {

		int x=50;
		int y=40;
		
	System.out.println("Before swapping");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("After swapping");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	}

}
