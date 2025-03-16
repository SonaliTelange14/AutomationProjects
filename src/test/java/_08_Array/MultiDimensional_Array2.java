package _08_Array;

public class MultiDimensional_Array2 {

	public static void main(String[] args) {
		//int array 5*5
int[][] numbers= {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	
for(int[] n:numbers)
{
	for(int n1:n)
	{
		System.out.print(n1 +" ");
	}
	System.out.println();
}
	
	//String array 4*3
	String[][] str= {{"ram","nayan","jay"},{"megha","rupa","bhumi"},{"krushna","dev","shree"},{"paru","lila","puna"}};
      for(String[] s:str)
      {
    	  for(String subvalue:s)
    	  {
    		System.out.print(subvalue +" ");  
    	  }
    	  System.out.println();
      }
}

}
	
