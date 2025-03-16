package _02_wrapper_Class;

public class Examples_DataTypeConversionIntoString {
	public static void main(String[] args) {
		//Example1- convert int to  string
		int k=10;
		Integer i=k;   //first convert primitive datatype to its wrapper class, then use inbuilt method toString()
		String str=i.toString();
		System.out.println("String: "+str);
		
		//Example2:convert String  to int
		//Note- if string contain numbers then only this conversion possible
		String s="100";
		Integer num=new Integer(s);
		int a=num;
		System.out.println(a);
		
		
		
	}

}
