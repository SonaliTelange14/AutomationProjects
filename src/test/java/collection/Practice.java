package collection;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.add("sonali");
		list.add("pranav");
		list.add("guru");
		
		LinkedList list2 = new LinkedList();
		list2.add("manav");
		list2.add("sonali");
		list2.add("pragati");
		
		
		LinkedList L3 = new LinkedList(list);
		L3.retainAll(list2);
		
		
		System.out.println(L3);

	}

}
