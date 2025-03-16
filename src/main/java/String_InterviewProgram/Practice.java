package String_InterviewProgram;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		
		int num=2334356;
		int[] count=new int[10];
		int lastDigit;
		while(num>0)
		{
			lastDigit=num%10;
			count[lastDigit]++;
			num=num/10;
		}
		for(int i=0; i<10; i++)
		{
			if(count[i]==1)
			{
				System.out.print(i);
			}
		}
	}

}
