package String_InterviewProgram;
//Problem statement:-Convert upper case character to lower case and lower case character to upper case
//Input string- Hello World
//Ouput - hELLO wORLD

public class _09_ReverseCase_Uppercase_Lowercase {
	
	    public static void main(String[] args) { 
	        String input = "Hello World"; 

	        StringBuilder result = new StringBuilder(); 
	        char[] data = input.toCharArray();

	        for (char c : data) {  

	            if (Character.isUpperCase(c)) { 
	                result.append(Character.toLowerCase(c)); 
	            } else if (Character.isLowerCase(c)) { 
	                result.append(Character.toUpperCase(c)); 
	            } else {
	                result.append(c);
	            }
	        }

	        System.out.println("OG String: " + input); 
	        System.out.println("Result: " + result.toString()); 
	    }
	}


