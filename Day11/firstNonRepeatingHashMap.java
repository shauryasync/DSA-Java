import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        String s = "programming";
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }

	}
}
