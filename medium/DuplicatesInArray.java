package medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array of integers, 1 <= a[i] <= n (n = size of array), some elements 
 * appear twice and others appear once. Find all the elements that appear twice 
 * in this array. Could you do it without extra space and in O(n) runtime?
 */
public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i: findDuplicates(new int []{1,2,1,2,3})){
			System.out.println(i);
		}
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> ret = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return ret;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int neg = Math.abs(nums[i]) - 1;
            if(nums[i] > len)
                neg = neg - len;
            if(nums[neg]>0)
                nums[neg] = -nums[neg];
            else
                nums[neg] = len - nums[neg];
        }
        for(int i=1;i<=len; i++){
            if(nums[i-1] > len)
                ret.add(i);
        }
        return ret;
	}

}
