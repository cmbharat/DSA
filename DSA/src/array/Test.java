package array;
import java.util.*;
import java.lang.*;
import java.io.*;
class Test {
//    public static int maximumSubarraySum(int[] arr,int size) {
//        int n = arr.length;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i <= n - 1; i++) {
//            int currSum = 0;
//            for (int j = i; j <= n - 1; j++) {
//            currSum += arr[j];
//            if (currSum > maxSum) {
//                maxSum = currSum;
//            }
//            
//            }
//        }
//
//        return maxSum;
//    }
//    
	
	public static int maxSum(int arr[], int n, int k)
    {
        // k must be smaller than n
        if (n < k)
        {
           System.out.println("Invalid");
           return -1;
        }
      
        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
      
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }
    
    public static void main(String args[]) {
        // Your code goes here
    	Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
        int [] arr=new int[n];
        int size=s.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		
        System.out.println(maxSum(arr,n,size));
    }
}