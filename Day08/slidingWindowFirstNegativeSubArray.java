import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {2, -1, 5, 1, -3, 2};
        int k = 3;
        for(int i = 0; i <= arr.length - k; i++){
            boolean found = false;
            for(int j = i; j < i + k; j++){
                if(arr[j] < 0){
                    found = true;
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        if(!found){
            System.out.print("0 ");
        }
        
        
        }
        
	}
}

