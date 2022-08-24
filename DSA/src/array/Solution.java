package array;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		// Write your code here
        

		Scanner s=new Scanner(System.in);
        String expected=s.next();
        String typed=s.next();
        
        
        System.out.println(faultyKeyboard(expected,typed));
    }
    
    	 public static boolean faultyKeyboard(String expected, String typed) {
	        
	        // Variables to store the length of the strings.
	        int n = expected.length();
	        int m = typed.length();
	        
	        int i=0,j=0;
	        
	        if(n>m)
	            return false;
	        
	        while(i<n && j<m)
	        {
	            if(expected.charAt(i) == typed.charAt(j))
	            {
	                i++;
	                j++;
	                
	            }else if(i>0 && expected.charAt(i-1)==typed.charAt(j))
	            {
	                j++;
	            }else{
	                return false;
	            }
	        }
	        
	        while(j<m){
	            if(expected.charAt(i-1) != typed.charAt(j))
	            { 
	                return false;
	            }
	            j++;
	        }
	        return i<n ? false : true;
	    }
}