package easy;

/*
 *  Given an integer, write a function to determine if it is a power of three.
Follow up:
Could you do it without using any loop / recursion? 
 */
public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(0));
		
	}

	public static boolean isPowerOfThree(int n) {
        /*if(n>1){
            while(n%3 == 0) n /= 3;
        }
        return n==1;
        */
        // OR
        return n==0?false:n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
}
