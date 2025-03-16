package collection;
//LinkedHashSet: Stores multiple objects/data. Not allows duplicate. -->store data in insertion order

import java.util.LinkedHashSet;
public class Set2_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet();
		ls.add(30);
		ls.add(29);
		ls.add(40);
		ls.add(20);
		ls.add(1);
		ls.add(1);
		ls.add(40);
		
		System.out.println(ls);
		
		int size=ls.size();
		System.out.println("size:"+size);
		
		System.out.println(ls.contains(1));
		
		System.out.println(ls.contains(100));
		
		ls.remove(1);
		System.out.println(ls);
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		//String type - LinkedHashSet
		System.out.println("String type - LinkedHashSet:");
		LinkedHashSet<String> ls2=new LinkedHashSet<String>();
		ls2.add("bhumi");
		ls2.add("suva");
		ls2.add("avi");
		ls2.add("purna");
		ls2.add("aaa");
		System.out.println(ls2);
		
		
	}

}
