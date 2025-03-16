package Array_InterviewProgram;

import java.util.Arrays;

public class CountOfDigit {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 1, 5, 7, 8, 3, 6, 7, 7, 7, 1 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (i != arr.length - 1) //Checks if the current element is not the last in the array. This avoids checking beyond the last element.
			{
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;

					} else
						break;

				}
			}

			System.out.println(arr[i] + " :" + count);
			i = i + (count - 1);  //moves i forward to avoid re-processing duplicates.
			                      //Without this line, i would move only one position forward each time, re-checking the same elements and printing duplicates.

		}

	}

}
