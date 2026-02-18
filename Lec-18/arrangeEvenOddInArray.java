import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int [] nums = {0,1,2,3,4};
		int lo = 0;
		int hi = nums.length - 1;
		
		while(lo < hi){
		    if(nums[lo] % 2 == 0 && lo < hi) lo++;
		    if(nums[hi] % 2 == 1 && lo < hi) hi--;
		    if(lo < hi){
		        int t = nums[lo];
		        nums[lo] = nums[hi];
		        nums[hi] = t;
		    }
		}
		    
		
		
		System.out.println(""+Arrays.toString(nums));

	}
}
