import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        String s = "programming";
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
                System.out.println("Processing: " + c);
                System.out.println(map);

            }else{
                map.put(c,1);
                System.out.println("Processing: " + c);
                System.out.println(map);

            }
        }
        
        /*for(char key: map.keySet()){
            //System.out.println(key+" --> "+map.get(key));
        }*/
    }
}
