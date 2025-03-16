package String_InterviewProgram;
//Progarm statement: find duplicate characters in string(without count it)
public class _06_Find_Duplicate_Characters__withoutCount {

	public static void main(String[] args) {
	String str="selenium java";
	char[] arr=str.toCharArray();
	for(int i=0; i<=arr.length-1; i++)
	{
		int count=1;
		if(arr[i]==0 || arr[i]==' ')
		{
			continue;
		}
		for(int j=i+1; j<=arr.length-1; j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]=0;
			}
		}
		if(count>1)
		{
			System.out.println(arr[i]);
		}
	}
	}

}
