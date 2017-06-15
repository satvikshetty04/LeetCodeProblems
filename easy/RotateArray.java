package easy;

/*
 * Rotate an array of n elements to the right by k steps. 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rotate(new int[]{1,2,3,4,5}, 7);
	}

	public static void rotate(int[] nums, int k) {
		if(nums == null)
			return;
		k = k%nums.length;
		rotater(nums, 0, nums.length - 1);
		rotater(nums, 0, k-1);
		rotater(nums, k, nums.length - 1);
	}

	private static void rotater(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j){
			int temp = nums[j];
			nums[j--] = nums[i];
			nums[i++] = temp;
		}
	}
}
