package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {2, 3, 4, 3, 5, 5, 5, 9, 8, 9};
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if(!add) {
				duplicates.add(nums[i]);
			}
		}
		System.out.println(duplicates);
		System.out.println(duplicates.size());
	}

}
