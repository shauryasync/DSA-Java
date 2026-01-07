import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s1 = "silent";
		String s2 = "listen";
		
		if(s1.length() != s2.length()){
		    System.out.println("not anagram");
		    return;
		}
		
		HashMap <Character, Integer> map= new HashMap<>();
		for(char c: s1.toCharArray()){
		    map.put(c, map.getOrDefault(c,0) +1);
		}
		
		for(char c: s2.toCharArray()){
		    if(!map.containsKey(c)){
		        System.out.println("not anagram");
		        return;
		    }
		    map.put(c,map.get(c) - 1);
		}
		
		for(int key: map.values()){
		    if(key != 0){
		        System.out.println("not anagram");
		        return;
		    }
		}
		System.out.println("anagram");
	}
}
