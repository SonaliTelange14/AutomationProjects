package oops7_Encapsulation;

public class Bank {
	private int accountBalance=1000;
	
	//getter method- read only  (have return value)
	int getAccountBalance()
	{
	return accountBalance;	
	}
	
	//setter method-write  only  
	//(does not return value, i.e void - set parameter in method to write value)
	void setAccountBalance(int balance)
	{
		accountBalance=balance;
	}
	}
	


