package _01_Basics;
//for-each loop used for only array and collecton
import java.util.ArrayList;

public class Enhanced_For_Loop {

	public static void main(String[] args) {

		// array
		String[] str = { "mona", "sona", "radha", "paru" };

		for (String names : str) {
			System.out.println(names);
		}

		System.out.println("--------------------------------------------------");
		
		
		// collection
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(89);
		al.add(32);
		al.add(320);
		al.add(98);

		for (Integer numbers : al) {
			System.out.println(numbers);
		}
	}

}
