package easy;

import java.util.Stack;

/*
 * Write a function that takes a string as input and returns the string reversed.
 */

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("Satvika"));
	}

	//Using just a char array
	/*
	public static String reverseString(String s) {
        char str[]=s.toCharArray();
        StringBuilder rev=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
            rev.append(str[i]);
        return rev.toString();
    }*/
	
	//Using a stack
	/*
	public static String reverseString(String s) {
		Stack<Character> str = new Stack<Character>();
		for(Character i:s.toCharArray()){
			str.push(i);
		}
		StringBuilder sb = new StringBuilder();
		while(!str.isEmpty()){
			sb.append(str.pop());
		}
		return sb.toString();
	}*/
	
	// Using two pointers
	
	public static String reverseString(String s) {
        char str[]=s.toCharArray();
        int j = s.length() - 1;
        for(int i=0; i< s.length()/2; i++){
        	char temp = str[i];
        	str[i] = str[j];
        	str[j] = temp;
        	j--;
        }
        return new String(str);
    }
	
}
