package Number_InterviewProgram;
import java.util.*;
public class _03_PrimeNumber_CheckGivenNumber {
	public static void main(String[] args) {
	int count=0;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	
	for(int i=2; i<=num-1; i++) {
		
	if(num%i==0)
	{
		count++;
	}
	}
	if(count==0)
	{
		System.out.println(num+" Number is prime");
	}
	else
	{
		System.out.println(num+" is not prime number");
	}

}
}