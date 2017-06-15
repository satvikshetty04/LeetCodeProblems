package easy;

/*
 * Given an m * n matrix M initialized with all 0's and several 
 * update operations. Operations are represented by a 2D array, 
 * and each operation is represented by an array with two positive integers a and b, 
 * which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 * You need to count and return the number of maximum integers in the matrix 
 * after performing all the operations.
 */
public class RangeAddition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{2,2},{3,3}};
		System.out.println(maxCount(3, 3, b));
		
	}

	public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0 || ops == null)
            return m*n;
        int min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;
        for(int i =0; i<ops.length; i++){
            min_x = (min_x>ops[i][0])?ops[i][0]:min_x;
            min_y = (min_y>ops[i][1])?ops[i][1]:min_y;
        }
        return min_x * min_y;
    }
}
