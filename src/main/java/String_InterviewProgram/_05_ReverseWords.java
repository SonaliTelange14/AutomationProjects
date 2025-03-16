package String_InterviewProgram;
//Input- String s= "This interview is for automation testing" 
//output- "testing automation for is interview This"


public class _05_ReverseWords  {
    public static void main(String[] args) {
        String s = "This interview is for automation testing";
        
        
        
        // Use StringBuilder to build the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
     // Split the string by spaces to get individual words
        String[] words = s.split(" ");
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);  //append(...) is a method of the StringBuilder class, which adds the specified text (in this case, a word from words[i]) to the end of the StringBuilder
            
            // Add a space after each word except the last one
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        
        // Print the result
        System.out.println(reversedSentence.toString());
        
    //toString() method converts the contents of the StringBuilder to a String type, 
    //which System.out.println requires to print text to the console. 
    //StringBuilder itself does not output as a String, so .toString() is necessary to make it readable as text.
    }
}



