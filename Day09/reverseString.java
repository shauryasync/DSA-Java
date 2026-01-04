import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String ch = "coding";
		char [] s = ch.toCharArray();
		int start = 0;
		int end = s.length - 1;
		
		while (start < end) {
		    char temp = s[start];
		    s[start] = s[end];
		    s[end] = temp;
		    start++;
		    end--;
		}
		
		String newch = new String(s);
		System.out.println(newch);
	}
}
