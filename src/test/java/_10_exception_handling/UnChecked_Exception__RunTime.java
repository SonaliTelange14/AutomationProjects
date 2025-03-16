package _10_exception_handling;
//Unchecked exception- those exception is not seen by compiler,

//and those exception coming at run time.
//those exception handled by try-catch block only

public class UnChecked_Exception__RunTime {

	public static void main(String[] args) {
		System.out.println("line1");
		try {
			int result = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("any number is not divisible by zero");
		}
		System.out.println("line2");
		
		
		

	}
}
