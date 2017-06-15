package easy;

/*
 * Given a column title as appear in an Excel sheet, 
 * return its corresponding column number.
 */

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("ZZ"));
	}

	public static int titleToNumber(String s) {
        int num = 0;
        int len = s.length();
        if(s.length() == 0)
        	return 0;
        char ar[] = s.toCharArray();
        for(int i =0; i< len; i++){
        	num *= 26;
        	num += ar[i] - 64;
        }
		return num;
    }
}
