package String_InterviewProgram;
//Progarm statement: find duplicate characters in string and count it.
public class _07_Find_Duplicate_Character__withCount {

	public static void main(String[] args) {
		String str = "java is programming language";

		char[] arr = str.toCharArray();

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 1; // counting current character itself so initialize count=1
			if (arr[i] == 0 || arr[i] == ' ') // skip it if current character is already processed or skip it if its is
												// a space
			{
				continue;
			}

			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {

					count++;
					arr[j] = 0; // skip it if current character is already processed
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + " : " + count);
			}
		}

	}

}
