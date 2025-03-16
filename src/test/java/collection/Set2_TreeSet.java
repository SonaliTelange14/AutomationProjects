package collection;

import java.util.LinkedHashSet;

//TreeSet: Stores multiple objects.Not allows duplicate.
//-->TreeSet stores data in Ascending order only .

import java.util.TreeSet;
public class Set2_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet();
		ts.add(200);
		ts.add(30);
		ts.add(15);
		ts.add(600);
		ts.add(75);
		System.out.println(ts);
		
		int size=ts.size();
		System.out.println("size:"+size);
		
		System.out.println(ts.contains(600));
		
		ts.remove(600);
		
		System.out.println(ts);
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		
		
		//String type - TreeSet:
		System.out.println("String type - TreeSet:");
	TreeSet<String> ls2=new TreeSet<String>();
		ls2.add("bhumi");
		ls2.add("suva");
		ls2.add("avi");
		ls2.add("zoya");
		ls2.add("purna");
		System.out.println(ls2);
		for(String str:ls2)
		{
			System.out.println(str);
		}
		
		

	}

}
