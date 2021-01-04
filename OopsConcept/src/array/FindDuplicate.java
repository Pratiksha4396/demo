package array;

import java.util.Arrays;
/*
 * .Find duplicate value from an array.
 */
public class FindDuplicate {

	public static void main(String[] args) {
		 int a [] ={10,25,5,8,8,9,6,3,41,51,41,0,0,15,15};
		 System.out.println("Array is " +Arrays.toString(a));
	        int count =a.length;
	        for(int i=0;i<count;i++)
	        {
	            for(int j=i+1;j<count;j++)
	            {
	                if(a[i]==a[j])
	                {
	                    System.out.println("Duplicate Values From Arrey is " +a[i]);
	                }
	                
	            }
	        }

	}

}
