package array;

import java.util.*;

public class ArrayIntersectionAfterSort {
	public static void main(String[] args) {
		int arr1[] = {10,10 };
		int arr2[] = {10};
		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		// Your code goes here

		int m = arr1.length;
		int n = arr2.length;

		if (m > n) {
			int tempp[] = arr1;
			arr1 = arr2;
			arr2 = tempp;

			int temp = m;
			m = n;
			n = temp;
		}

		// Now arr1[] is smaller
		// Sort smaller array arr1[0..m-1]
		ArraysTest.sort(arr1);
//		for (int i = 0; i < m; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
		ArraysTest.sort(arr2);
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr2[i] + " ");
//		}

		for (int i = 0; i < n;) {
			for (int j = 0; j < m;) {
				if (arr2[i] == arr1[j]) {
					System.out.print(arr2[i]+" ");
					i++;
					j++;
				} else if (arr2[i] > arr1[j]) {
					j++;
				} else
					i++;
			}

		}

	}
}