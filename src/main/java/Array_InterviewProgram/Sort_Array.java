package Array_InterviewProgram;
//sort array and find largest element in array
import java.util.*;

public class Sort_Array {

	public static void main(String[] args) {
		int[] arr= {8,6,4,9,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //converts the sorted array to a string format
		
		//find largest element in array:
		
		System.out.println(arr[arr.length-1]); //The first arr is the array itself, and the [ ] is used to access a specific element in the array.
		
		
		//find second largest element in array
		System.out.println(arr[arr.length-2]);

	}

}
