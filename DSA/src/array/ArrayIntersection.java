package array;

import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();

		}
		n = s.nextInt();

		int arr2[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = s.nextInt();

		}
		
		  for (int i=0;i<arr1.length;i++){
	            for (int j=0;j<arr2.length;j++)
	            {
	                if(arr1[i]==arr2[j])
	                {
	                    System.out.print(arr1[i]+" ");
	                    arr2[j]=Integer.MAX_VALUE;
	                    break;
	                }
	            }
	        }

	}

	

}
