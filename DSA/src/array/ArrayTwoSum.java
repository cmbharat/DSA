package array;

import java.util.Scanner;

public class ArrayTwoSum {

	public static void main(String[] args) {
		
		int arr1[]= {8,5,2};

		
		int arr2[]= {1,3};

		
		int size = 0;
		if (arr1.length >= arr2.length)
			size = arr1.length + 1;
		else
			size = arr2.length + 1;

		int result[] = new int[size];
		int sum = 0, carry = 0;
		
		int i = arr1.length-1, j = arr2.length-1, k = size- 1;
		
		 while (j >= 0)
	        {
	            // find sum of corresponding element
	            // of both array.
	            sum = arr1[i] + arr2[j] + carry;
	             
	            result[k] = (sum % 10);
	     
	            // Finding carry for next sum.
	            carry = sum / 10;
	     
	            k--;
	            i--;
	            j--;
	        }
		 while (i >= 0)
	        {
	            // Add carry to first array elements.
	            sum = arr1[i] + carry;
	            result[k] = (sum % 10);
	            carry = sum / 10;
	     
	            i--;
	            k--;
	        }
		while(k==0 && carry>0 && result[0]==0)
			result[0]=carry;
	        
		 
		for(int l=0;l<size;l++)
		{
			System.out.print(result[l]);
		}


	}

}
