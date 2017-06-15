package easy;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given two arrays, write a function to compute their intersection. 
 */
public class IntersectionTwoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i:intersect(new int[]{1,2,2,1},new int[]{2,2}))
			System.out.println(i);
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null)
			return null;
		int len1 = nums1.length;
		int len2 = nums2.length;
		if(len1>len2)
			return findIntersect(nums1,nums2);
		else
			return findIntersect(nums2,nums1);
	}

	private static int[] findIntersect(int[] nums2, int[] nums1) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> ret = new ArrayList<>();
		Integer val;
		for(int i:nums2)
			map.put(i, map.getOrDefault(i, 0) + 1);	

		for(int i:nums1){
			val = map.get(i);
			if(val != null && val>0){
				ret.add(i);
				map.put(i, --val);
			}
		}
		int a[] = new int[ret.size()];
		for(int i=0; i<ret.size(); i++)
			a[i] = ret.get(i);
		return a;
			
	}

}
