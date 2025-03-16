package _03_typecating;

public class PrimitiveTypeCating_2_ImplicitNarrowing {

	public static void main(String[] args) {
     //convert int to short
		int n=30;
		short s= (short)n;
		System.out.println(s);
		
		//byte range= -128 to 127
//-128 -127 -126....0...>1 2 3 ...127...>-128 -127 -126 -125....0...>1 2 3 ..128 ==>goes into loop
		//so in byte +128 = -128, +129= -127, +130 = -126, +131 = -125 so on
		int k=130;
		byte s2=(byte)k;
		System.out.println(s2);  //130 = -126
	}

}
