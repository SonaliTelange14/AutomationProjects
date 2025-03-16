package _10_exception_handling;
//Checked exception- those exception checked by compiler, 
//and it handled by throws keyword with main() method and try-catch block
public class Checked_Exception__CompileTime {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Line1");
		Thread.sleep(3000);
		System.out.println("Line2");


	}

}
