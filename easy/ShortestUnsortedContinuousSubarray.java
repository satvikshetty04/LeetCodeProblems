package easy;

import java.util.Arrays;

/*
 * Given an integer array, you need to find one continuous subarray that 
 * if you only sort this subarray in ascending order, then the whole array 
 * will be sorted in ascending order, too. 
 * You need to find the shortest such subarray and output its length.
 */
public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray(nums));
		System.out.println(findUnsortedSubarray1(nums));
	}
	
	//n solution
	public static int findUnsortedSubarray1(int[] nums) {
		if(nums == null || nums.length == 1)
			return 0;
		int len = nums.length;
		int min = nums[0];
		int max = nums[len -1];
		int start = 0, end = -1;
		for (int i=1;i<len;i++) {
		      max = Math.max(max, nums[i]);
		      min = Math.min(min, nums[len-1-i]);
		      if (nums[i] < max) end = i;
		      if (nums[len-1-i] > min) start = len-1-i; 
		}
		return end - start + 1;
	}
	
	
	//n lgn solution
	public static int findUnsortedSubarray(int[] nums) {
		if(nums == null || nums.length == 1)
			return 0;
		int temp[] = nums.clone();
		Arrays.sort(temp);
		int start = 0;
		int end = 0;
		for(start = 0; start < nums.length; start++)
			if(temp[start] != nums[start])
				break;
		for(end = nums.length -1; end>start; end--)
			if(temp[end] != nums[end])
				break;
		return end - start + 1;
	}

}
