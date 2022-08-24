package array;

import java.util.Arrays;

public class ArrayUniqueElement {

	public static void main(String[] args) {
		int arr1[] = {1 ,3, 1, 3, 6, 6, 7, 10 ,7};

		Arrays.sort(arr1);
		
		int result=findUniqueAfterSort(arr1);
		
        System.out.println(result);
	}
	
	public static int findUnique(int[] arr) {
		//Your code goes here
        int count=1;
        int i,j;
        for( i=0;i<arr.length;i++)
        {
            for( j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                    break;
            }
            
            if(j==arr.length){
                return arr[i];
            }
        }
        return -1;
	}
	
	public static int findUniqueAfterSort(int[] arr) {
		//Your code goes here
		int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        
        return XOR;
	}
}


