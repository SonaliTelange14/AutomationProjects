package Number_InterviewProgram;

import java.util.Scanner;

public class _02_Palindrome_Number {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	int temp;
	temp=num;
	System.out.println("original number:"+num);
	int lastDigit;
	int rev=0;
	
	while(num > 0)
	{
		lastDigit=num%10;
		rev=rev*10 +lastDigit;
		num=num/10;
		
	}
	num=temp;
	System.out.println("reversed number:"+rev);
	if(num==rev)
	{
		System.out.println(num+" is palindrome number");
	}
	else
	{
		System.out.println(num+" is not palindrome number");
	}
	}

}
