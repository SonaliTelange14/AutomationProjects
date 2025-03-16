package collection;
import java.util.HashMap;
import java.util.Set;
/*
 * #Map- Store multiple object(key and value)
 * #Map contains data in Key and Value format.
 * # not allow duplicate keys but if keys are duplicate then point to the latest value to this key.
 * # it allows duplicate values.
 * ->put()- instead of add() method ,in Map using put() method for adding key and values. 
 * ->keySet()- is the extra method present in Map and it Returns a Set  of the keys contained in this map.
 *->get()- Returns the value to which the specified key is mapped,
 * or null if this map contains no mapping for the key.  
 * -->HashMap-data stored in random order .
 * -->LinkedHashMap-data stored in insertion order.
 * -->TreeMap-data stored in Ascending order.
 * */
 
public class Map3_HashMap {

	public static void main(String[] args) {
		 HashMap<Integer,String> hm=new HashMap();
		 hm.put(5, "Zoya");
		 hm.put(400, "dhonu");
		 hm.put(3, "Manav");
		 hm.put(1, "abhi");
		 hm.put(30, "purav");
		 hm.put(5, "ekta");
		 hm.put(300, "abhi");
		 
		 System.out.println(hm);
		 
		 
		 
		int size= hm.size();
		System.out.println(size);
		
		System.out.println(hm.get(30));
		
		System.out.println(hm.containsKey(30));
		
		hm.remove(30);
		System.out.println(hm);
		
		//keyset()
		//give keys
		Set<Integer> set=hm.keySet();
		System.out.println("keyset:"+set);
		
		//give values 
		for(Integer values:set)
		{
			System.out.println(hm.get(values));
		}
		
	    
		
		 

	}

}
