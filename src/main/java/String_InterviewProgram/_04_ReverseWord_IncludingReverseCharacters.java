package String_InterviewProgram;
//input:  java is programming language;

//output: egaugnal gnimmargorp si avaj

public class _04_ReverseWord_IncludingReverseCharacters {
	public static void main(String[] args) {
		
	
	String str="java is programming language";
	System.out.println("original string:"+str);
	StringBuilder sb = new StringBuilder();
	sb.append(str);
	sb.reverse();
	System.out.println("Reverse Words String:"+ sb.toString());
	

	}

}
