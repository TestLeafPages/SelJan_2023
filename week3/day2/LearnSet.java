package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> companies = new HashSet<String>();
		
		companies.add("TCS");
		boolean add = companies.add("Wipro");
		System.out.println(add);
		companies.add("CTS");
		boolean add2 = companies.add("Wipro");
		System.out.println(add2);
		companies.add("Infosys");
		companies.add("Accenture");
		
		System.out.println(companies);
		
		System.out.println(companies.size());
		
		List<String> list = new ArrayList<String>(companies);
		System.out.println(list.get(0));
	}

}
