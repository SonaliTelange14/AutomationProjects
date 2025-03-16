package collection;

import java.util.ArrayList;

public class List1_ArrayList {
	public static void main(String[] args) {
		
		//ArrayList of all type value
		ArrayList lst = new ArrayList();
		//add()
		lst.add(10);
		lst.add(20);
		lst.add("radha");
		lst.add('d');
		lst.add(true);
		lst.add(78.43);
		System.out.println(lst);
		
		//size()
		int size=lst.size();
		System.out.println("size:"+size);
		
		//contains()
		System.out.println(lst.contains("radha"));
		
		//get()
		System.out.println(lst.get(5));
		
		//remove()
		lst.remove(1);
		System.out.println(lst);
		
		
		//iterate arraylist using simple for loop
		System.out.println("iterate arraylist using simple for loop");
		for(int i=0; i<lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}
		
		
		//ArrayList of only Integer value
		
		ArrayList<Integer> list1= new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(20); //allow duplicate
		System.out.println("arraylist of Integer data:"+list1);
		System.out.println(list1.get(2));
		System.out.println(list1.contains(100));
		System.out.println("size:"+list1.size());
		list1.remove(3);
		System.out.println(lst);
		
		System.out.println("iterate using simple for loop");
		//iterate using simple for loop
		for(int j =0; j<list1.size(); j++)
		{
			System.out.println(list1.get(j));
		}
		
		//iterate using for each loop
		System.out.println("iterate using simple for each loop");
	for(Object l1:list1)  //each element in collection is Object only
	{
		System.out.println(l1);
	}
		
	}

}
