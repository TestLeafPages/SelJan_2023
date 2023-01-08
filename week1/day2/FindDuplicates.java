package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		
		// after sorting --> 2, 2, 3, 5, 5, 7, 7, 9
		
		// 1, 5, 7 --> duplicates
		
		/*
		 * Psuedocode:
		 * 1. loop through a number (outer loop)
		 * 2. loop through the next number (inner loop)
		 * 3. Compare both the numbers
		 * 4. if it is same, print and break
		 * 
		 */
		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					System.out.println(nums[i]);
//					break;
//				}
//			}
//		}
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1]) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
