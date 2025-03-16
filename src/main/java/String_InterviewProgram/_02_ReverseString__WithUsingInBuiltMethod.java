package String_InterviewProgram;

//Statement: reverse string using inbuilt reverse method

public class _02_ReverseString__WithUsingInBuiltMethod {

	public static void main(String[] args) {
		String str = "I Love Java";
		System.out.println("Original String:" + str);

		// method1: using StringBuffer -->StringBuffer is thread Safe and it has inbuilt
		// reverse method
		StringBuffer str1 = new StringBuffer("I Love Java");
		str1.reverse();
		System.out.println(str1.toString());
//------------------------------------------------------------------------------------------	

		// Method2: using StringBuilder -->StringBuilder is not thread safe and it has
		// inbuilt reverse method
		StringBuilder str2 = new StringBuilder("I Love Java");
		str2.reverse();
		System.out.println(str2.toString());

//-------------------------------------------------------------------------------------------
		// Mthod3: Convert to character array by toCharArray() method of String
		String str3 = "Selenium";
		System.out.println("Original String:" + str3);
		char[] ch = str3.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
