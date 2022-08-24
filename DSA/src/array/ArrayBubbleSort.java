package array;

import java.util.Scanner;

public class ArrayBubbleSort {

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


		
			 
		}

	

}
