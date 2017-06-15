package easy;

/*
 *  Given an array nums, write a function to move all 0's to the end of it 
 *  while maintaining the relative order of the non-zero elements.
 *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 *  nums should be [1, 3, 12, 0, 0]. 
 */

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0, 0, 4, 0, 3, 12};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
        int ptr = 0;
        for(int i=0; i< nums.length; i++){
        	while(i< nums.length && nums[i] == 0){
        		i++;
        	}
        	if(i>=nums.length)
        		break;
    		nums[ptr] = nums[i];
        	ptr++;
        }
        for(int i = ptr; i<nums.length;i++){
        	nums[i] = 0;
        }
        for(int i =0; i<nums.length;i++){
        	System.out.print(nums[i] + " ");
        }
    }
}
