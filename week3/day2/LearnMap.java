package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		/*
		 * List, Set --> Interfaces (Collection)
		 * Single Dimensional data
		 * 
		 * When you like to store the data in 2 dimension data
		 * (key, value pair) ==> Map
		 * 
		 * Map --> Interface
		 * Can I create object for Map? No
		 * How to use Map? Through implementing classes
		 * 	- HashMap --> faster (Random) - Hashing algorithm
		 *  - TreeMap --> key ASCII order
		 *  - LinkedHashMap --> Order of Insertion (key)
		 *  
		 * - key, value --> Pair --> EntrySet
		 * Key --> No duplicates allowed (set)
		 * Value --> Duplicates are allowed
		 * 
		 * 
		 */
		Map<Integer, String> mentors = new HashMap<Integer, String>();
		
		// to add item to map
		mentors.put(1001, "Aravind");
		mentors.put(1002, "Ram");
		mentors.put(1003, "Easwer");
		
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		Set<Entry<Integer, String>> entrySet = mentors.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println(mentors.containsKey(1001));
		
	}

}
