package easy;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,4,3,1,1,2};
		System.out.println(singleNumber(nums));
	}
/*
	public static int singleNumber(int[] nums) {
		int xor = 0;
		for(int i:nums){
			xor ^= i; 
		}
		return xor;
	}*/
	
	//Extra storage
	public static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:nums){
			if(set.contains(i))
				set.remove(i);
			else
				set.add(i);
		}
		return set.iterator().next();
	}
}
