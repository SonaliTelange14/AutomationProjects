package Number_InterviewProgram;

//Check prime number between 1 to 100
public class _04_PrimeNumber__1to100 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Prime numbers between 1 to 100:");
		for (int n = 1; n <= 100; n++) {
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					count++;
				}

			}

			if (count == 0) {

				System.out.println(n);
			}

			else {
				count = 0;      //If count is not 0, it means n had divisors, so it is not a prime number. 
				                //The count variable is reset to 0 to start fresh for the next number.
			}

		}

	}

}
