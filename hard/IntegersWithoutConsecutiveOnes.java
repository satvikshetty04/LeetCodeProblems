package hard;

/*
 * Given a positive integer n, find the number of non-negative integers less than 
 * or equal to n, whose binary representations do NOT contain consecutive ones.
 */
public class IntegersWithoutConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findIntegers(8));
	}

	public static int findIntegers(int num) {
		StringBuilder c =new StringBuilder(Integer.toBinaryString(num)).reverse();
		int len = c.length();
		int n1[] = new int[len];
		int n2[] = new int[len];
		n1[0] = n2[0] = 1;
		for(int i=1; i<len; i++){
			n1[i] = n1[i-1] + n2[i-1];
			n2[i] = n1[i-1];
		}
		int ret = n1[len-1] + n2[len-1];
		for(int i=len-2; i>=0; i--){
			if(c.charAt(i+1) == '1' && c.charAt(i) == '1')
				break;
			if(c.charAt(i+1) == '0' && c.charAt(i) == '0')
				ret -= n2[i];
		}
		return ret;
	}
}
