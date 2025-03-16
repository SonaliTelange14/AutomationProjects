package _08_Array;
//Jagged array is like multi dimensional array, which having each row contains different column

public class Jagged_Array__MultiDimensional {

	public static void main(String[] args) {
		int[][] num = {{1,2,3,4},{2,3,4,5,6},{4,3,2,3,4,5,6},{1,3}};
		for(int[] n1:num)
		{
			for(int n:n1)
			{
				System.out.print(n +" ");
			}
			System.out.println();
		}

	}

}
