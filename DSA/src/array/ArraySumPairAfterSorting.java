package array;

import java.util.Arrays;

public class ArraySumPairAfterSorting {

	public static void main(String[] args) {
		int arr1[] = {0,6,0,0};

		Arrays.sort(arr1);
        int l = 0;
        int r = arr1.length;
//        while (l < r) {
//            System.out.print(arr1[l]);
//        	l++;
//        }
//		
		int result=pairSum(arr1,6);
		
        System.out.println(result);
	}
	
	public static int pairSum(int[] arr, int num) {
		 int l, r;
		 
	        /* Sort the elements */
	        Arrays.sort(arr);
	        int count=0;
	        /* Now look for the two candidates
	        in the sorted array*/
	        l = 0;
	        r = arr.length-	1 ;
	   
	        System.out.print(" ");
	        while (l < r) {
	            if (arr[l] + arr[r] == num)
	                count++;
	            else if (arr[l] + arr[r] < num)
	                l++;
	            else // A[i] + A[j] > sum
	                r--;
	        }
	        return count;
	}
	
}


