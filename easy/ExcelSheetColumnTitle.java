package easy;

/*
 * Given a positive integer, return its 
 * corresponding column title as appear in an Excel sheet
 */

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(52));
	}

    public static String convertToTitle(int n) {
    	StringBuilder s = new StringBuilder();
    	while(n>0){
    		n--;
    		s.insert(0, (char) (65 + n%26));
    		n = n/26;
    	}
    	return s.toString();
    }
}
