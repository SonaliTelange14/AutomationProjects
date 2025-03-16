package _03_typecating;

public class PrimitiveTypeCasting_1_AutoWidening {
	public static void main(String[] args) {
		// convert byte to int
		byte a = 10;
		int n = a;
		System.out.println(n);

		long l = 39l;
		//every decimal(flaot & double) datatype is bigger than whole data type
		//convert long to float
		//convert long to double
		float f=l;
		double d=l;
		System.out.println(f);
		System.out.println(d);
	}
}
