package array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.print(sum(arr));
	}
	
	public static int sum(int [] arr)
	{
	    int arrsum=0;
	    for(int i=0;i<5;i++)
	    arrsum+=arr[i];
	    return arrsum;
	}

}
