package _08_Array;

public class Program_2 {
	public static void main(String[] args) {
		// check number is multiple of 2
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++)
			
		{
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
			else
			{
				System.out.println(num[i]+" is not multiple of 2");
			}
		}
	}

}
