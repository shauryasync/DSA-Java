import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr = {2,4,3,5};
		int n = arr.length;
		int runSum = 0;
		int i = 0;
		while(i < n){
		    runSum += arr[i];
		    arr[i] = runSum;
		    i++;
		}
		
		System.out.println(""+Arrays.toString(arr));

	}
}
