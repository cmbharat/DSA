package array;

import java.util.*;
public class ArraySortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };
		int m = arr1.length;
		int n = arr2.length;
		
		ArraysTest.sort(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
