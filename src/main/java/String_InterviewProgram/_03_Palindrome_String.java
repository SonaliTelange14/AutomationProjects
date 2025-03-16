package String_InterviewProgram;

public class _03_Palindrome_String {

	public static void main(String[] args) {
		String str="Madam"; //str=madam
		System.out.println("Original String:"+str);
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse string: "+rev);
if(str.equalsIgnoreCase(rev))   //if(str.equals(rev)) 
{
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not palindrome");
}
	}

}
