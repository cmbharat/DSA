package array;

import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter size");
		int n = s.nextInt();

		System.out.println("enter array");
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();

		}
		rotate(arr1,2);
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i]);;

		}

	}
	
	 public static void rotate(int[] arr, int d) {
	    	//Your code goes here
	        int n=arr.length;
	        if(d > n) 
	            d=d%n;
	 
	        int[] result = new int[n];
	 
	        for(int i=0; i < d; i++){
	            result[i] = arr[n-d+i];
	        }
	 
	        int index=0;
	        for(int i=d; i<n; i++){
	            result[i] = arr[index++];
	        }
	        
	        arr=result;
	    }

}
