package collection;

import java.util.LinkedList;

public class List1_LinkedList {
public static void main(String[] args) {
	

 LinkedList<String> l = new LinkedList<String>();
 l.add("Bhumi");
 l.add("sonali");
 l.add("sachin");
 l.add("telange");
 l.add("telange"); //allow duplicate
 
 System.out.println(l);
 
 int size=l.size();
 System.out.println("size:"+size);
 
 System.out.println(l.get(3));
 
 System.out.println(l.contains("sachin"));
 
 System.out.println(l.contains("maya"));
 
 l.remove(1);
 System.out.println(l);
 
 for(int i =0; i<l.size();i++)
 {
	 System.out.println(l.get(i));
 }
 System.out.println("-------------------------------------------------------");
 
 for(Object str:l)
 {
	 System.out.println(str);
 }
}
}
