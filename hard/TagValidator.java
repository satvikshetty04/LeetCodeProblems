package hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Given a string representing a code snippet, you need to implement a 
 * tag validator to parse the code and return whether it is valid.  Problem 591
 */
public class TagValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"));
		System.out.println(isValid("<DIV><![CDATA[<div>]]></DIV>"));
	}
	
	public static boolean isValid(String code) {
		// TO BE COMPLETED
		//String pattern = "(<(\\w*)>[^\\w+][^\\W+]<\\\\(\\w*\\)>\\)";
		//String pattern = "<([\\w]*)>([\\w+\\W+]+)(<!\\[CDATA\\[)([\\w+\\W+]+)(\\]\\]>)([\\w+\\W+]+)<.([\\w]*)>";
		String pattern = "<([\\w]*)>([\\w+\\W+]+)<.([\\w]*)>";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(code);
		if(m.find()){
			System.out.println(m.group(0));
			String st = m.group(1);
			String mid =m.group(2);
			String end = m.group(3);
			if(st.length()>9 || !st.equals(end))
				return false;
			String pattern2 = "([\\w]+<!\\[CDATA\\[)([\\w+\\W+]+)(\\]\\]>)";
			r = Pattern.compile(pattern2);
			m = r.matcher(mid);
			if(!m.find())
				return false;
			return true;
		}
		return false;
		
	}

}
