package collection;
//Set-HashSet: store multiple object, not allows  duplicate --> Store data in random order.

//iterate through simple for loop is not possible bcoz set not contains index, 
//only traverse through enhanced for loop
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set2_HashSet {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet();

		// add()
		h.add(20);
		h.add(10);
		h.add(5);
		h.add(50);
		h.add(3);
		h.add(20);
		h.add(5);

		System.out.println(h);
		// size()
		int size = h.size();
		System.out.println("size:" + size);

		// contains()
		System.out.println(h.contains(5));

		// remove()
		System.out.println(h.remove(50));
		System.out.println(h);
		
		for(Integer i:h)
		{
			System.out.println(i);
		}
		
		
		//String type - HashSet:
		System.out.println("String type - HashSet:");
		HashSet<String> ls2=new HashSet<String>();
		ls2.add("bhumi");
		ls2.add("suva");
		ls2.add("avi");
		ls2.add("purna");
		System.out.println(ls2);
		

	}

}
