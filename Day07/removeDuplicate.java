import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {1, 2, 3, 4, 2, 3, 4};
		Arrays.sort(arr);
		int i = 0;
		
		for (int j = 1; j < arr.length; j++){
		    if (arr[j] != arr[i]){
		        ++i;
		        arr[i] = arr[j];
		    }
		}
		
		for (int k = 0; k <=i; k++){
		    System.out.print(arr[k]+" ");
		}
		
	}
}
