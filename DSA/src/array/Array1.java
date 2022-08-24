package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		printArray(arr);

	}

	public static int[] takeInput() {

		Scanner s = new Scanner(System.in);
		System.out.println("enter size");

		int n = s.nextInt();
		int arr[] = new int[n];  
		for (int i = 0; i < n; i++) {
			System.out.println("enter element"+i);
			arr[i]=s.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
	
		}
	}
}



