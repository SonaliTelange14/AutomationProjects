
//Check given number is even or odd
package Number_InterviewProgram;
import java.util.Scanner;

public class _07_Even_Odd_Number_CheckGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
		System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}

	}

}
