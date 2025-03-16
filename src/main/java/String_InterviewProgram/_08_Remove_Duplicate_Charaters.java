package String_InterviewProgram;

public class _08_Remove_Duplicate_Charaters {
	
	    public static void main(String[] args) {
	        
	        
	        String str = "selenium java tutorial";
	        char[] arr = str.toCharArray();
	        String targetString = "";  // Initialize the target string as an empty string
	        
	  for (char value : arr) {
   if (targetString.indexOf(value) == -1) {  // Check if the character is already added to targetString
	 targetString += value;  // Append the character to targetString if it's not already present
	            }
	        }

	        System.out.println(targetString);  // Print the string without duplicates
	    }
	}



