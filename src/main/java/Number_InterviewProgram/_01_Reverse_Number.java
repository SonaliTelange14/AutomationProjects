package Number_InterviewProgram;

public class _01_Reverse_Number {

	public static void main(String[] args) {
		int n=257;
		int rev=0;
		int lastDigit;
		System.out.println("original number:"+n);
		
		while(n > 0)
		{
			lastDigit=n%10;  //extract last digit and save in this variable
			rev=rev*10+lastDigit;  //rev*10-->creates space to add the next digit to its rightmost place
			n=n/10; //delete last digit from n
		}
		System.out.println("reverse number:"+rev);
	}

}
