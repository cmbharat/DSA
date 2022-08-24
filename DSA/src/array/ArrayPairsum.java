package array;

import java.util.Scanner;

public class ArrayPairsum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter size");
		int n = s.nextInt();

		System.out.println("enter array");
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();

		}

		int k = 12;
		int result = 0;
		for (int i = 0; i < arr1.length - 2; i++) {
			for (int j = i + 1; j < arr1.length - 1; j++) {
				for (int m = j + 1; m < arr1.length; m++) {
					if (arr1[i] + arr1[j] + arr1[m] == k) {
						result++;
					}
				}
			}

		}

		System.out.println(result);
	}

}
