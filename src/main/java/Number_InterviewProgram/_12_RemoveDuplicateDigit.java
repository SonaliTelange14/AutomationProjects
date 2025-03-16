package Number_InterviewProgram;

public class _12_RemoveDuplicateDigit {

	public static void main(String[] args) {
		int num=71615179;
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
				System.out.println(i);
			}
		}

	}

}
