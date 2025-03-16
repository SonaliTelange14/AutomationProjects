package _01_Basics;

public class Ternary_Operator {
	public static void main(String[] args) {
		// Example 1
		int n1 = 30, n2 = 50;
		boolean result;
		result = n1 < n2 ? true : false;
		System.out.println(result);

		// Example 2--------------------------------------------------------------
		int k1 = 8, k2 = 9, max;
		max = k1 > k2 ? k1 - k2 : k1 + k2;
		System.out.println(max);
		// Example 3---------------------------------------------------------------

		String str1 = "rahil", str2 = "rahil";
		int test;
		test = str1 == str2 ? 100 : 300;
		System.out.println(test);

		// Example 4-----------------------------------------------------------------

		int a = 20, b = 70;
		int add;
		add = a > b ? 90 : 100;
		System.out.println(add);
	}

}
