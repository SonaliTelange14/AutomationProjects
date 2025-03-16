package Collection_InterviewProgram;

import java.util.ArrayList;
import java.util.List;

public class Find_CommonElement_Between_TwoList__retainAll {

	public static void main(String[] args) {
		// Define the lists
		ArrayList<String> L1 = new ArrayList<String>();
		L1.add("A");
		L1.add("B");
		L1.add("C");

		ArrayList<String> L2 = new ArrayList<String>();
		L2.add("D");
		L2.add("E");
		L2.add("B");

		// Find common elements
		ArrayList<String> commonElements = new ArrayList<String>(L1);
		commonElements.retainAll(L2); // retainAll() method is used to keep only (common elements)the elements in a
										// collection that are also present in another specified collection.

		// Print common elements
		System.out.println("common elements in both list:" + commonElements);
		
		
		//remove common element
		ArrayList<String> removeCommon =new ArrayList<String>(L1);
		removeCommon.removeAll(L2);
		System.out.println("remove common elements from both list: "+removeCommon);
	}

}
