package easy;

/*
 * Given a string, find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.
 */

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("lollipop"));
	}
	
	public static int firstUniqChar(String s) {
		if(s == null | s.length()==0)
			return -1;
		int ar[] = new int[26];
		char str[] = s.toCharArray();
		for(int i=0; i<s.length();i++)
			ar[str[i] - 97]++;
		for(int i=0; i<s.length();i++)
			if(ar[str[i] - 97] == 1)
				return i;
		return -1;
	}

}
