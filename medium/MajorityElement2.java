package medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array of size n, find all elements that appear more than n/3 times. 
 * The algorithm should run in linear time and in O(1) space.
 */
public class MajorityElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,3,2,3,3,0,2,2,2};
		System.out.println(majorityElement(nums));
	}

	public static List<Integer> majorityElement(int[] nums) {
		if(nums == null) return null;
		List<Integer> l = new ArrayList<Integer>();
		int n1 =0, n2 =0;
		int cnt1 = 0, cnt2 =0;
		for(int i =0; i<nums.length; i++){
			if(n1 == nums[i])
				cnt1++;
			else if(n2 == nums[i])
				cnt2++;
			else if(cnt1 == 0){
				cnt1++;
				n1 = nums[i];
			}
			else if(cnt2 == 0){
				cnt2++;
				n2 = nums[i];
			}
			else{ 
				cnt1--;
				cnt2--;
			}
		}
		cnt1 = 0;
		cnt2 = 0;
		for(int i =0; i<nums.length; i++){
			if(nums[i] == n1)
				cnt1++;
			else if(nums[i] == n2)
				cnt2++;
		}
		if(cnt1>nums.length/3)
			l.add(n1);
		if(cnt2>nums.length/3)
			l.add(n2);
		return l;
	}
}
