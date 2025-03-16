package _01_Basics;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter multiple words in string:");
		String str=input.nextLine();
		System.out.println(str);
		
		System.out.println("enter string");
		String str1=input.next();
		System.out.println(str1);
		
		System.out.println("enter number:");
		int number=input.nextInt();
		System.out.println(number);
		
		System.out.println("enter boolean value:");
		boolean b=input.nextBoolean();
		System.out.println(b);

	}

}
