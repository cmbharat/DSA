package array;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String args[]) {
		// Your code goes here
		int[] A = { 1, 2, 3, 4, 5 };
		int N = 2;
		leftShift(A, N);

	}

	public static void leftShift(int[] arr, int N) {

			int temp[]=new int [N];
			
			for(int i=0;i<N;i++)
			{
				temp[i]=arr[i];
			}

			for (int i = 0; i < arr.length - N; i++) {

				arr[i] = arr[i + N];
			}
			for(int j=0,i=arr.length - N;i<arr.length;i++,j++)
			{
				arr[i]=temp[j];
			}
		
	}
}