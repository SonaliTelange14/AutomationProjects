package Number_InterviewProgram;
//program: find Duplicate digits with their counts
public class _11_FindDuplicateDigits {
	public static void main(String[] args) {
		int num = 9566899;
		int[] count = new int[10];  //why take 10-->digit= 0 to 9 =total 10 digits

		// Count each digit's occurrence
		while (num > 0) {
			int lastDigit = num % 10; // Get the last digit
			count[lastDigit]++; // Increase the count for that digit
			num =num/ 10; // Remove the last digit
		}

		// Print only duplicates
		System.out.println("Duplicate digits with their counts:");
		for (int i = 0; i < 10; i++) //digit= 0 to 9 =total 10 digits 
		{
			if (count[i] > 1) {
				System.out.println("Digit: " + i + ", Count: " + count[i]);
			}
		}
	}
}
