package _07_StringConcept2__StringBuilder_and_StringBuffer;

public class StringBuilder_Methods {

	public static void main(String[] args) {
// 1. append() --> Adds the specified data at the end of the existing sequence of characters.

		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1.append("World"));
		
		System.out.println("==================================");
		
		
// 2. insert() --> Inserts the specified data at the specified index within the sequence.
		StringBuilder sb2 = new StringBuilder("Java Selenium");
		System.out.println(sb2.insert(4, "Python"));
		
		System.out.println("==================================");
		
		
//3. replace() --> Replaces a portion of the sequence with the specified string.
		StringBuilder sb3 = new StringBuilder("Java Selenium");
		System.out.println(sb3.replace(0, 4, "Python"));
		
		System.out.println("==================================");
		
		

// 4. delete() --> Deletes the characters in the specified range of indices.
		StringBuilder sb4 = new StringBuilder("Bhumi Telange");
		System.out.println(sb4.delete(6, 13));
		
		System.out.println("==================================");
		
		
// 5. reverse() --> Reverses the entire character sequence.
		StringBuilder sb5 = new StringBuilder("Diretor");
		System.out.println(sb5.reverse());
		
		System.out.println("==================================");
		
		
// 6. setCharAt() --> Changes the character at the specified index.
		StringBuilder sb6 = new StringBuilder("Hello");
		sb6.setCharAt(0, 'Y');
		System.out.println(sb6);
		
		System.out.println("==================================");
		
		
// 7. length() --> Returns the length (number of characters) in the current sequence.
		StringBuilder sb7 = new StringBuilder("Hello Girls");
		System.out.println(sb7.length());
		
		System.out.println("==================================");
		
		
// 8. substring() --> Returns a substring from the specified start index up to the end index (optional).
		StringBuilder sb8 = new StringBuilder("Hello Girls,Bye!");
		System.out.println(sb8.substring(5, 16));
		
		
		System.out.println("==================================");
// 9. toString() --> Converts the contents of the StringBuilder and StringBuffer to a String.
		StringBuilder sb9 = new StringBuilder("Hello Kids");
		System.out.println(sb9.toString());

	}

}
