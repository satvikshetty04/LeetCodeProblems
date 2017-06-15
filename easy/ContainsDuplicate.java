package easy;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(containsDuplicate(new int[]{1,2,3,1}));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums == null)
			return false;
		HashSet<Integer> set = new HashSet<Integer>(nums.length);
		for(int n : nums)
			if(!set.add(n)) return true;
		return false;
	}

}
