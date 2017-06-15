package medium;

import java.util.Arrays;

/*
 * Given a non-empty integer array, find the minimum number of moves required 
 * to make all array elements equal, where a move is incrementing a selected element 
 * by 1 or decrementing a selected element by 1.
 * You may assume the array's length is at most 10,000.
 */
public class MinimumMovesEqualArrayElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minMoves2(new int[]{1,2,3,4}));
	}
	
	public static int minMoves2(int[] nums) {
		if(nums == null|| nums.length == 1)
			return 0;
		Arrays.sort(nums);
		int med = nums.length, cnt = 0;
		med = nums[med/2];
		for(int i=0; i<nums.length;i++)
			cnt += Math.abs(nums[i]-med);
		return cnt;
	}

}
