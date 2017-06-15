package medium;


/*
 * A zero-indexed array A consisting of N different integers is given. 
 * The array contains all integers in the range [0, N - 1]. 
 * Input: A = [5,4,0,3,1,6,2]. O/P: 4
 * S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 */
public class ArrayNesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {0,2,1};
		System.out.println(arrayNesting(nums));
	}
	
	public static int arrayNesting(int[] nums) {
		if(nums == null)
			return 0;
		int len = nums.length, cnt= 0, val;
		int max = Integer.MIN_VALUE;
		int temp[] = new int [len];
		for(int i =0; i<len; i++){
			if(temp[i] == 1)
				continue;
			val = nums[i];
			cnt = 1;
			while(i != val){
				temp[val] = 1;
				val = nums[val];
				cnt++;
			}
			max = (max<cnt)?cnt:max;
			if(max>(len-i)/2)
				return max;
		}
		return max;
	}

}
