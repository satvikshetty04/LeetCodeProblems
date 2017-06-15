package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Given an array of integers where 1 <= a[i] <= n (n = size of array), some elements 
 * appear twice and others appear once. 
 * Find all the elements of [1, n] inclusive that do not appear in this array. 
 * Could you do it without extra space and in O(n) runtime? You may assume the returned 
 * list does not count as extra space.
 */
public class NumbersDisappearedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i: findDisappearedNumbers(new int []{1,2,1,2})){
			System.out.println(i);
		}
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int len=nums.length;
		List<Integer> list=new LinkedList<Integer>();
		/*for(int i=0;i<len;i++)
			list.add(nums[i]);
		for(int i=1;i<=len;i++)
			if(list.contains(i))
				list.removeAll(Arrays.asList(i));
			else
				list.add(i);
		return list;*/
		
		for(int i=0; i<len; i++){
			int neg = Math.abs(nums[i]) - 1;
			if(nums[neg]>0)
				nums[neg] = -nums[neg];
		}
		for(int i=1; i<=len; i++)
			if(nums[i-1]>0)
				list.add(i);
		return list;
		
		
	}

}
