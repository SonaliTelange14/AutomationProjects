//Program statement:Write a Java Program to handle given un check exception- 
//1.ArrayIndexOutOfBound & 2.NullPointerException

public class ExceptionHandling {

	public static void main(String[] args) {

//1.ArrayIndexOutOfBoundException
		try
		{
		int[] arr= {10,20,30,40,50};
 
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Unable to access elements greater than index size of the array");
		}
		System.out.println("Next line executed");
		

//2.NullPointerException
		String str1=null;
		String str2="Java";
		
		System.out.println(str1.equals(str2));
		
		System.out.println("Next line executed");
		
    }

}
