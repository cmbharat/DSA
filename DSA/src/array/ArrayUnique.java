package array;

import java.util.Scanner;

public class ArrayUnique {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(printUnique(arr));
	}

	public static int printUnique(int arr[]) {

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int increment = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				else {
					if (arr[i] == arr[j]) {
						increment++;
						break;
					}
				}
			}
           if(increment==1)
        	   result=arr[i];
		}

		return result;
	}

}
