import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String sss = "Education";
		String ss = sss.toLowerCase();
		char[] s = ss.toCharArray();
		char[] vow = {'a', 'e', 'i', 'o', 'u'};
		int vowels = 0;
		for(int i = 0; i < s.length; i++){
		    for(int j = 0; j < vow.length; j++){
		        if(s[i] == vow[j]){
		            vowels++;
		        }
		    }
		}
		System.out.println("Vowels: " + vowels);

	}
}
