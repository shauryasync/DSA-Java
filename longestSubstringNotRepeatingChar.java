import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes InheritableThreadLocal
		String s = "abacae";
		int left = 0;
		int right = 0;
		int windowSize = 0;
		int MaxwindowSize = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (right = 0; right < s.length(); right++){
		    char c = s.charAt(right);
		    if(map.containsKey(c)){
		        left = Math.max(left,map.get(c)+1);
		    }
		    map.put(c, right);
		   
		    windowSize = (right - left)+1 ;
		    MaxwindowSize = Math.max(MaxwindowSize,windowSize);
		}
		
		System.out.println(MaxwindowSize);

	}
}
