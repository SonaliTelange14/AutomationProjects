package Number_InterviewProgram;

//Problem statement: check given number is Armstrong or not.
//Armstrong Number -The number is equal to sum of cube of its each digits.
//eg. 153--> 1^3 + 5^3 + 3^3 =153
public class _09_ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		
		int sum=0;
		int lastDigit;
		
		while(num>0)
		{
			lastDigit=num%10;
			sum=sum+(lastDigit)*(lastDigit)*(lastDigit);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
			System.out.println("Given number is not Armstrong number");

	}

}
