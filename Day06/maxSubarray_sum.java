import java.util.*;
import java.lang.*;
import java.io.*;

class maxSubarraysum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int maxValue = Integer.MIN_VALUE;
		int [] arr = {1,2,3};
		int n = arr.length;
		for(int i = 0; i < n; i++){
		    for(int j = i; j < n; j++){
		        int sum = 0;
		        for(int k = i; k <= j; k++){
		            sum += arr[k];
		        }
		        if(sum > maxValue){
		            maxValue = sum;
		        }
		    }
		}
		System.out.println("maxValue: "+maxValue);

	}
}
