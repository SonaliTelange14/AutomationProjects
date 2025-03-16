package Number_InterviewProgram;
/*Factorial Program in Java: 
 * Factorial of n is the product of all positive descending integers. 
 * Factorial of n is denoted by n!
 * For example:
4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120*/

public class _05_FactorialNumber {

	public static void main(String[] args) {
		int num = 5; // find factorial of 5
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("factorial of 5 is: " + factorial);

	}

}
