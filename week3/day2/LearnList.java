package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();
		
		// add the mentors to list
		mentors.add("Aravind");
		mentors.add("Ram");
		mentors.add("Easwar");
		mentors.add("Ram");
		
		// identify number of mentors in list
		System.out.println(mentors.size());
		
		// to get the first item from the list
		System.out.println(mentors.get(0));
		
		// print all items in list
		System.out.println(mentors);
		
		mentors.add("Dhilip");
		System.out.println(mentors.size());
		
		mentors.remove(1);
		
		System.out.println(mentors.size());
		System.out.println(mentors);
		
		// to check if an item is present
		System.out.println(mentors.contains("Haja"));
		
		// to clear all items in list
//		mentors.clear();
		System.out.println(mentors);
		
		// convert to array
		Object[] array = mentors.toArray();
		System.out.println(array.length);
		System.out.println(array[1]);
		
		// Sort the items
		Arrays.sort(array);
		
		// to sort any collection
		Collections.sort(mentors);
		System.out.println(mentors);
		Collections.reverse(mentors);
		System.out.println(mentors);
		
	}

}
