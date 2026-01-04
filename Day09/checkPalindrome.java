import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String ch = "madam";
		char[] s = ch.toCharArray();
		int start = 0;
		int end = s.length - 1;
		boolean flag = true;
		while(start < end){
		    if(s[start] != s[end]){
		        flag = false;
		        break;
		    }
		    start++;
		    end--;
		}
		
		if(flag){
		    System.out.println("palindrome");
		    
		}
		else{
		    System.out.println("not palindrome");
		}
	}
}
