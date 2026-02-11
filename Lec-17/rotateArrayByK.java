import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes InheritableThreadLocal
		int [] arr = {1,2,3,4,5};
		int k = 3;
		int j = 0;
		int n = arr.length;
		int [] nArr = new int [n];
		
		for(int i = n - k; i < n ; i++){
		    nArr[j++] = arr[i];
		}
		
		for(int i = 0; i < n - k; i++){
		    nArr[j++] = arr[i];
		}
		
		for(int el : arr){
		    System.out.print(el+" ");
		}
		
		System.out.println();
		
		for(int el : nArr){
		    System.out.print(el+" ");
		}

	}
}
