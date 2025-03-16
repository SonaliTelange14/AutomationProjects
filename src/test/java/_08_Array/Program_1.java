package _08_Array;

public class Program_1 {
	public static void main(String args[])
	{
		int[] arr = new int[5];
		arr[0]=20;
		arr[1]=32;
		arr[2]=90;
		arr[3]=78;
		arr[4]=93;
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		
		//iterate value using for loop

		System.out.println("iterate value using for loop");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		char[] ch= {'d','e','l','w','q','3'};
		System.out.println(ch[5]);
		System.out.println("iterate value using for loop");
		for(int j=0; j<ch.length; j++)
		{
			System.out.println(ch[j]);
		}
		
		//String array:
		
		String[] str = {"madam","pavan","radha","kunal","bhumi"};
		System.out.println(str[4]);
		for(int k=0; k<str.length; k++)
		{
			System.out.println(str[k]);
		}
		
		//Iterate value in array using enhanced for loop(for each loop)
		String[] name = {"raghu","prem","jay","krushna"};
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}
