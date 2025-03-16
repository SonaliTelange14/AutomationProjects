package String_InterviewProgram;
//Program statement- Take String-> input:A2B3C3 & output:AABBBCCC
public class _08_String_Decoding_A2B3C3__AABBBCCC {

	public static void main(String[] args) {
		String str="A2B3C4";
		
		for(int i=0; i<=str.length()-1;i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
	
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int x=Character.getNumericValue(str.charAt(i));
				for(int j=1; j<x; j++)  //A2B3C4--> at j=0 alphabetic character already present and its prints
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}

	}

}


/* Why str.charAt(i-1))  in System.out.print(str.charAt(i-1));-->  

 * This line prints the character before the current character.
 * When the current character is a number, str.charAt(i-1) gets the previous character, which is a letter.
 * This allows the program to repeat the letter based on the number following it.
 * For example, if str is "A2", and i is at 2, then str.charAt(i-1) points to "A". 
 *This lets the program print "A" multiple times.
 */
			