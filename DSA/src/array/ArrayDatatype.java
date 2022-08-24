package array;

import java.util.Scanner;

public class ArrayDatatype {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter n");
		int num = s.nextInt();

		int result[] = takeInput(num, s);

		printArray(result);

	}

	public static int[] takeInput(int num, Scanner s) {

		int result[] = new int[num];
		
		for(int i=0,j=1;i<=((num-1)/2);i++)
		{
          result[i]=j;
          j+=2;
          
		}
		int evenStart=0;
		
		if(num%2==0)
		evenStart=num;
		else
			evenStart=num-1;
			
		for(int k=((num-1)/2)+1;k<num;k++)
		{
			
			result[k]=evenStart;
			evenStart-=2;
		}
		return result;
	}

	public static void printArray(int result[]) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
