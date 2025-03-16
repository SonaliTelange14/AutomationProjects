/*
 * The Fibonacci series is a series where the next term is the sum of the previous two terms. 
 * The first two terms of the Fibonacci sequence are 0 followed by 1.
 * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * */
package Number_InterviewProgram;
//Program statement: Print fibonacci series of 10
public class _06_Fibonacci_Series {

	public static void main(String[] args) {
		int a=0,b=1;
		int c;
		int count=10;  //print 10 fibonacci series
		
		System.out.println(a);
		System.out.println(b);
	
		for(int i=2; i<=count; i++) 
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}

	}

}
