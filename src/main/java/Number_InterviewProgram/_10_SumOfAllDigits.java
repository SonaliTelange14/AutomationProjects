package Number_InterviewProgram;
//input=4567
//output=(4+5+6+7)=22

public class _10_SumOfAllDigits {
	public static void main(String[] args) {
		
	
	int num=4567;
	int sum=0;
	int lastDigit;
	
	while(num>0)
	{
		lastDigit=num%10;
		sum=sum+lastDigit;
		num=num/10;
	}
	System.out.println(sum);

}
}