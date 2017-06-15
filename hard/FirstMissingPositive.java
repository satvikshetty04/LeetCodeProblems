package hard;

/*
 *  Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space
 */
public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstMissingPositive(new int[]{-1,100,1}));
	}
	
	public static int firstMissingPositive(int[] nums) {
        if(nums == null)
            return 1;
        int len = nums.length, i = 0;
        for(i=0;i<len; i++)
            if(nums[i]>len || nums[i]<0)
                nums[i] = 0;
        for(i=0;i<len; i++)
            if(nums[i]>0){
                int n = (nums[i]>len)?(nums[i]-len - 2):(nums[i] - 1);
                if(nums[n]<=0)
                    nums[n] = nums[n] - len - 1;
                else if(nums[n]<=len)
                    nums[n] = nums[n] + len + 1;
            }
        for(i=0;i<len; i++)
            System.out.println(nums[i]);
        for(i=1;i<=len; i++)
            if(Math.abs(nums[i-1]) <= len)
                return i;
        return i;
    }

}
