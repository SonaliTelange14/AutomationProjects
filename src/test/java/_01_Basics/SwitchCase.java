package _01_Basics;

public class SwitchCase {

	public static void main(String[] args) {
	
		int month=3;
		String monthName;
		
		switch(month)
		{
		case 1: monthName="january";
		System.out.println(monthName);
		break;
		
		case 2: monthName="february";
		System.out.println(monthName);
		break;
		
		case 3: monthName="march";
		System.out.println(monthName);
		break;
		
		case 4: monthName="april";
		System.out.println(monthName);
		break;
		
		default : System.out.println("Not matching");
		
		}
		
		}
		
	}


