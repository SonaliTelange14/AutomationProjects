package _01_Basics;

/* instanceof operator:
The instanceof operator is a binary operator that checks whether an 
object is of particular type. It is used for object or reference variable only.
*/
public class instanceof_operator {

	public static void main(String[] args) {
		instanceof_operator obj = new instanceof_operator();
		System.out.println(obj instanceof instanceof_operator);
		//make object/reference variable null
		obj=null;
		System.out.println(obj instanceof instanceof_operator);

	}

}
