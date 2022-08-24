package array;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter size");
		int n = s.nextInt();

		System.out.println("enter array");
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();

		}
		System.out.println("enter number to search");
		int num = s.nextInt();
		System.out.println(binarySearch(arr1, num));
	
	}
	 public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        
	        int start=0;
	        int end =arr.length-1;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	            
	            if(x>arr[mid])
	            {
	                start=mid+1;
	            }
	            else if(x<arr[mid])
	            {
	                end =mid-1;
	            }
	            else if(x==arr[mid])
	            {
	                return mid;
	            }
	           
	        }
	        return -1;
	    }

}
