package easy;

/*
 * Calculate the sum of two integers a and b, 
 * but you are not allowed to use the operator + and -.
 */

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(10, 4));
		
	}

	public static int getSum(int a, int b) {
		int carry;
		while(b!=0){
			carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}
}
