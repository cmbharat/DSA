package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("number of arrays");
		int num = s.nextInt();

		int result[] = takeInput(num, s);

		printArray(result);

	}

	public static int[] takeInput(int num, Scanner s) {

		int result[] = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("enter size");
			int sum = 0;
			int n = s.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				System.out.println("enter element" + j);
				arr[j] = s.nextInt();
				sum += arr[j];
			}
			result[i] = sum;

		}
		return result;
	}

	public static void printArray(int result[]) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
