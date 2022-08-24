package array;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class ArrayInsertionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter size");
		int n = s.nextInt();

		System.out.println("enter array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();

		}

		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			//insert element at ith position
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for (int j=i;j<arr.length;j++)
			{
				//finding min element among j positions
				if(arr[j]<min)
				{
					min=arr[j];
					minIndex=j;
				}
			}
			//swap element at min index with ith element
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			 
		}

	}

}
