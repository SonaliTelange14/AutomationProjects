package _08_Array;

public class MultiDimensional_Array {
	public static void main(String[] args) {
		//int[][] b =new int[3][4];
		int[][] arr1= {{2,3,4,5},{4,5,6,5},{6,7,6,4,}};
	
		for(int[] arr:arr1)
		{
			for(int a:arr)
			{
				System.out.print(a+" ");
		}
			System.out.println();
	
	}
}
}
