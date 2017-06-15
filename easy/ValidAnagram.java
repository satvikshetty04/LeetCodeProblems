package easy;

/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example, s = "anagram", t = "nagaram", return true.
 */
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("ab","ba"));
	}
	
	public static boolean isAnagram(String s, String t) {
		int[] arr = new int[26];
		char s1[] = s.toCharArray();
		char s2[] = t.toCharArray();
		for(int i =0; i<s1.length; i++)
			arr[s1[i] - 97]++;
		for(int i =0; i<s2.length; i++)
			arr[s2[i] - 97]--;
		for(int i=0; i<arr.length; i++)
			if(arr[i] != 0)
				return false;
		return true;
	}

}
