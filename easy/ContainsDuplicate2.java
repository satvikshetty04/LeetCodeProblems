package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers and an integer k, find out whether there are two distinct 
 * indices i and j in the array such that nums[i] = nums[j] 
 * and the absolute difference between i and j is at most k. 
 */
public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,5,6,4,1,7};
		System.out.println(containsNearbyDuplicate(nums, 4));
		
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums == null || k == 0)
			return false;
		//Using Hashset
		Set<Integer> set = new HashSet<>(k + 1); // set initial size for performance
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) { // add failed, duplicate
                return true;
            }
            if (i >= k) { // maintain size of set
                set.remove(nums[j++]); // j points to the earliest element
            }
        }
        return false;
		//Using HashMap
		/*HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			Integer val = map.get(nums[i]);
			if(val != null)
				if(Math.abs(val - i)<=k)
					return true;
			map.put(nums[i], i);
		}
		return false;
		*/
	}

}
