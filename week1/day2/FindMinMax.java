package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {

		int[] nums = { 22, 5, 45, 236, 189, 2, 3 };
		
		int length = nums.length;
		
		System.out.println(nums[0]);
		
		// 2, 5, 22, 45, 189, 236
		Arrays.sort(nums);
		
		System.out.println(nums[0]);
		System.out.println(nums[length-1]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for (int i = length-1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
