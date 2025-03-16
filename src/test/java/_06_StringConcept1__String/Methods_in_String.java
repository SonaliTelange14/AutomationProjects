package _06_StringConcept1__String;

public class Methods_in_String {

	public static void main(String[] args) {
//1-> length()
		// this method counts the length of the string and returns int value
		String str = "Java";
		int result = str.length();
		System.out.println("length of string : " + result);

		System.out.println("===================================================");

//2-> isEmpty()
		// this method returns boolean, it will check whether string is empty or full
		// and returns true or false
		String str1 = "I love java";
		boolean result1 = str.isEmpty();
		System.out.println("String is empty: " + result1);

		// Example 2
		String str2 = "";
		boolean result2 = str2.isEmpty();
		System.out.println("String is empty: " + result2);

		System.out.println("===================================================");

//3-> contains()
		// this method returns boolean and checks whether the given string contains a
		// particular set of words.
		String str3 = "I love java";
		String str4 = "java";
		boolean result3 = str3.contains(str4);
		System.out.println("string contains: " + result3);

		System.out.println("===================================================");

//4-> equals()
		// return type:Boolean and equals() is a method that compares the contents of
		// the objects to check for value equality.

		String str5 = new String("Selenium");
		String str6 = new String("Selenium");
		boolean result4 = str5.equals(str6);
		System.out.println("both strings are equal: " + result4);
		// eg. 2
		String s1 = "Madam";
		String s2 = "Madam";
		System.out.println("equals method:" + s1.equals(s2));

		System.out.println("===================================================");

//5-> equalsIgnoreCase()
		//return type:boolean
		//this method which checks irrespective of upper case and lower case letters ,checks only content
		String str7 = new String("selenium");
		String str8 = new String("Selenium");
		boolean result5 = str8.equalsIgnoreCase(str8);
		System.out.println("both strings are equal: " + result5);

		System.out.println("===================================================");

//6-> indexOf()
		//return type :int  -->give first index number of character in string
		//if String contains multiple 'e' character and we want start index of e or any single index then use above method
		String str9 = "Selenium";
		int result6 = str9.indexOf("e");
		System.out.println("Start index: " + result6);
		
		int result06 = str9.indexOf("m");
		System.out.println("single index:"+result06);

		System.out.println("===================================================");

//7-> lastIndexOf()
		//this method returns int.
		//if String contains multiple e character and we want last index of e then use above method
		String str10 = "Selenium";
		int result7 = str10.lastIndexOf("e");
		System.out.println("Last index: " + result7);

		System.out.println("===================================================");

//8-> replace()
	//returns String--> replace(char old,char new)
	// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.

		String str11 = "Java Selenium Automation";
		String result8 = str11.replace("Java", "Python");
		System.out.println("replaced string: " + result8);

		System.out.println("===================================================");

//9-> charAt()
		//Returns the char value at the specified index. 
		//An index ranges from 0 to length() - 1. 
		
		String str12 = "Selenium";
		char result9 = str12.charAt(6);
		System.out.println("character: " + result9);
	
		System.out.println("===================================================");
		
//10-> endsWith()
		//this method returns boolean, we need to give the string in the parameter, 
		//this will check whether the orignal string ends with the given string or not, and returns true or false

		String str13 = "I love java";
		boolean result10 = str13.endsWith("error");
		System.out.println("ends with given suffix: " + result10);
		
		System.out.println("===================================================");
		
		
//11-> startsWith()
		//   This method returns boolean, we need to give the string in the parameter, this will check whether the orignal string starts with the
	    //given string or not, and returns true or false

		String str14 = "I love java";
		boolean result11 = str14.startsWith("I");
		System.out.println("starts with given prefix: " + result11);
		System.out.println("===================================================");
//12-> toUpperCase()
		//This will take the string and prints the string in uppercase
		String str15 = "selenium java";
		String result12 = str15.toUpperCase();
		System.out.println("upper case: " + result12);
		System.out.println("===================================================");
		
		
//13-> toLowerCase()
		//This will take the string and prints the string in lower case
		String str16 = "SELENIUM";
		String result13 = str16.toLowerCase();
		System.out.println("lower case: " + result13);
		System.out.println("===================================================");
		
		
//14-> trim()
		//  This trim(); method removes the spaces if any, present in extreme right or extreme left corner of the string 
		//but not the spaces in between the string and it returns the new Object but not change the original string.

		String str17 = "            Java       ";
		System.out.println("String before trim method applied: " + str17);
		String result14 = str17.trim();
		System.out.println("String after remove white spaces(trim):" + result14);
		System.out.println("===================================================");
		
		
//15-> subString()
		//substring(int) method, if we mention index in the int parameter from that index it will print the string
		String str18 = "Inbox(30)";
		// wants substring- "Inbox"
		String result15 = str18.substring(0, 5);
		System.out.println("substring:" + result15);
		
		System.out.println("===================================================");
		
//16-> split() -->split(" ")  -->split each 'word' in string -->give one space in (" ")
		// This method splits the sentence into word, In the parameters we have to give the where we want to split the sentence 
		//String arr1[]=s1.split(" "); --> splits the string at the space and stores it in array
		String str19 = "My name is sonali";
		String[] result16 = str19.split(" ");
		System.out.println("splited words in string:");
		for (String arr : result16) {

			System.out.println(arr);
		}
//-------------------------------------------------------------------------------
//split("")---> split each 'character' in string
//if one ("") space will remove in double quote then it used to split character in each word
		String str20 = "My name is sonali";
		String[] result17 = str19.split("");
		System.out.println("splited characters in string:");
		for (String arr : result17) {
			System.out.println(arr);
		}
		System.out.println("===================================================");
		
		
//17->	concat(String)---> this method adds String to the already existing string.
		// Concatenates the specified string to the end of this string.
		String s21 = "hello";
		System.out.println(s21.concat("World"));
		System.out.println("===================================================");
		
		
//18-> compareTo()
		// String.compareTo(String) ) method does Unicode comparison and returns the
		// difference of the Unicode.
		// This will take the difference of Unicode of D to C and difference of Unicode
		// of A-A
		// which is 67-66 and 65-65= 1 and 0 and output is 1

		String s22 = "DA";
		String s23 = "CA";
		System.out.println("Unicode comparison:" + s22.compareTo(s23));

	}

}
