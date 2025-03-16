package String_InterviewProgram;

public class _12_RemoveExtraSpacesBetweenWords_InString {

	public static void main(String[] args) {
		String str="My name      is              sonali";
		System.out.println("original string:"+str);
		String str1=str.replaceAll("\\s+", " ").trim();
        System.out.println("updated string:"+str1);
	}

}
