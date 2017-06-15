package easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output �Fizz� instead of the number and for 
the multiples of five output �Buzz�. For numbers which are multiples of both three 
and five output �FizzBuzz�.
 */

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String s : fizzBuzz(19)){
			System.out.println(s);
		}
	}

	public static List<String> fizzBuzz(int n) {
        ArrayList<String> s=new ArrayList<String>(n);
		for(int i=1;i<=n;i++){
			if (i%15==0)
				s.add("FizzBuzz");
			else if(i%3==0)
				s.add("Fizz");
			else if(i%5==0)
				s.add("Buzz");
			else
				s.add(i+"");
		}
		return s;
    }
	
	
	// Without using % operator
	/*public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        } 
        return ret;
    }*/
}
