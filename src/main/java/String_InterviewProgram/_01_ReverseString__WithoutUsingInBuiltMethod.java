package String_InterviewProgram;
//Program Statement: reverse string without using inbuilt method

public class _01_ReverseString__WithoutUsingInBuiltMethod {

	public static void main(String[] args) {
		String str="Bhumi";
		System.out.println("Origial String:"+str);
		
		System.out.print("String after reverse:");
		
		for(int i =str.length()-1; i>=0; i--) //length-1 = index --> (eg. 5-1 = 4-->means 4th index)
		{                                     //length starts from 1 and index starts from 0
			System.out.print(str.charAt(i));
		}

	}

}
