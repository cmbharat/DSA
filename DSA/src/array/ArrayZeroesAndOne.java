package array;

import java.util.Scanner;

public class ArrayZeroesAndOne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter size");
		int n = s.nextInt();

		System.out.println("enter array");
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();

		}

		int nextZero=0;
		for (int i = 0; i < n; i++) {
			if(arr1[i]==0)
			{
				int temp=arr1[nextZero];
				arr1[nextZero]=arr1[i];
				arr1[i]=temp;
				nextZero++;
			}
				
		}
		
		for (int i = 0; i < n; i++) {
		 System.out.print(arr1[i]);				
		}

	
	}

}
