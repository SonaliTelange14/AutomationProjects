package _06_StringConcept1__String;

public class StringConstantPool_and_NonConstantPool {

	public static void main(String[] args) {
		
		//String class created using 2 types
		
		/*
		 * type1: 
		 * creating using = assignment(this string stored in constant pool):
		 * when new string created then JVM first check same staring already present or
		 * not in memory, if present then this new string object pointing to already
		 * present string, if not present then create new space for this latest string
		 * object in constant pool.
		 */
		String str1="Selenium"; 
		String str2="Selenium";
		System.out.println(str1==str2); //true
		//type2: creating using New keyword (this string stored in non constant pool)
       String str3 = new String("Java");
       String str4 = new String("Java");
       System.out.println(str3==str4);  //false
	}

}
