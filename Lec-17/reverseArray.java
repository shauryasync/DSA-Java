import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes InheritableThreadLocal
		int [] arr = {1,2,3,4,5};
		int start = 0;
		int end = arr.length - 1;
	    
	    for(int i : arr){
	        System.out.print(i+" ");
	    }
	    
	    while(start < end){
		    int temp = arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		}
		System.out.println();
		for(int i : arr){
	        System.out.print(i+" ");
	    }
	}
}
