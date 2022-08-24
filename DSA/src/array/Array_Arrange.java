package array;

import java.util.Scanner;

public class Array_Arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("enter n");
		int n = s.nextInt();

		int arr[]=new int [n];
		int left = 0;
		int right = n - 1;
		int counter = 1;

		while (left <= right) {
           if(counter%2==1)
           {
        	   arr[left]=counter;
        	   counter+=1;
        	   left ++;
           }else {
        	   arr[right]=counter;
        	   counter++;
        	   right--;
           }
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
//
//		int result[] = new int[n];
//
//		if (n > 0) {
//
//			for (int i = 0, j = 1; i <= ((n - 1) / 2); i++) {
//				result[i] = j;
//				j += 2;
//
//			}
//			int evenStart = 0;
//
//			if (n % 2 == 0)
//				evenStart = n;
//			else
//				evenStart = n - 1;
//
//			for (int k = ((n - 1) / 2) + 1; k < n; k++) {
//
//				result[k] = evenStart;
//				evenStart -= 2;
//			}
//
//			for (int l = 0; l < n; l++) {
//				System.out.print(result[l] + " ");
//			}
//
//		}

	}
}