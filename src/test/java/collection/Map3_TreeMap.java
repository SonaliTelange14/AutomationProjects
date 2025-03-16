package collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map3_TreeMap {
	public static void main(String[] args) {
		
	
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	
	//use scanner class for give keys and values from user ,use for loop for make set of 5 values
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
	System.out.println("enter key:");
	Integer k=sc.nextInt();
	
	System.out.println("enter value:");
	String v=sc.next();
	
	tm.put(k, v);
	System.out.println(tm);
	}
	
	System.out.println(tm.containsKey(4));
	
	tm.remove(1);
	System.out.println(tm);
	
	//keySet() - retrieve keys
	Set<Integer> k=tm.keySet();
	System.out.println("keys:"+k);
	
	//get()- retrieve values
	for(Integer v:k) {
		System.out.println("value:"+tm.get(v));
	}
	

}
}
