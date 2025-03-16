package collection;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * #Map- Store multiple object(key and value)
 * #Map contains data in Key and Value format.
 * # not allow duplicate keys but if keys are duplicate then point to the latest value to this key.
 * # it allows duplicate values.
 * ->put()- instead of add() method ,in Map using put() method for adding key and values. 
 * ->keySet()- is the extra method present in Map and it Returns a Set  of the keys contained in this map.
 * -->get()- Returns the value to which the specified key is mapped,
 * or null if this map contains no mapping for the key. 
 * HashMap-data stored in random order .
 * -->LinkedHashMap-data stored in insertion order.
 * -->TreeMap-data stored in Ascending order.
 * */

public class Map3_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(300, "Pune");
		lhm.put(102, "satara");
		lhm.put(50, "mumbai");
		lhm.put(900, "satara");
		lhm.put(50, "Noida");
		
		System.out.println(lhm);
		
		System.out.println("size:"+lhm.size());
		
		System.out.println(lhm.containsKey(50));
		
		lhm.remove(300);
		System.out.println(lhm);
		
		Set<Integer> l=lhm.keySet();
		System.out.println("keyset:"+l);
		
		for(Integer v:l)
		{
			System.out.println("values:"+lhm.get(v));   //Returns the value to which the specified key is mapped,
			                                           //or null if this map contains no mapping for the key. 
		}

	}

}
