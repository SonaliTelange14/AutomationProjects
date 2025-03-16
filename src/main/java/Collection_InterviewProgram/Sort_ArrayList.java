package Collection_InterviewProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(9);
		al.add(5);
		
		System.out.println("ArrayList Before sort:"+al);
		
		Collections.sort(al);   //Collections is the class-> java.util.Collections ->consists exclusively of static methods 
		System.out.println("ArrayList After sort:"+al);
	}

}
