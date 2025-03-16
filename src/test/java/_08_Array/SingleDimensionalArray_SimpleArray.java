package _08_Array;

public class SingleDimensionalArray_SimpleArray {
	public static void main(String[] args) {
		//way 1: create simple array using new keyword
		int[] arr1=new int[5];
		arr1[0]=5;
		arr1[1]=10;
		arr1[2]=15;
		arr1[3]=20;
		arr1[4]=25;
		System.out.println(arr1[0]);
		System.out.println("length of array arr1:"+arr1.length);
		System.out.println("iterate array using simple for loop:");
		for(int i =0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		//for each loop
		System.out.println("iteate array using for each loop:");
		for(int a:arr1)
		{
			System.out.println(a);
		}
		
		//way 2: create array using direct value initialization
		
		String[] arr2= {"mohan","ram","revati"};
		System.out.println("length of array str:"+arr2.length);
		
		System.out.println("iterate array using simple for loop:");

		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
		System.out.println("iteate array using for each loop:");

		for(String b:arr2)
		{
			System.out.println(b);
		}
				
	}

}
