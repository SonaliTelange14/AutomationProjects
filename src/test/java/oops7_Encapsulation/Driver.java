package oops7_Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println(obj.getAccountBalance());  //get value using getter methd
		obj.setAccountBalance(5000);  //set value using setter method
		System.out.println(obj.getAccountBalance()); //get updated value
	}

}
