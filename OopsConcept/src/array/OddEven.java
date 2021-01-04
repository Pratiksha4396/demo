package array;

import java.util.Arrays;
/*
 * Find even & odd value from an array.
 */
public class OddEven {

	public static void main(String[] args) {
		 int array[] ={10,80,41,13,2,3,5,8};
		 System.out.println("Array is "+Arrays.toString(array));
	        int count =array.length;
	        for(int i=0;i<count;i++)
	        {
	            if(array[i]%2==0)
	            {
	                System.out.println("Even number is"+array[i]);
	            }
	            else
	            {
	                System.out.println("Odd number is "+array[i]);
	            }
	        }

	}

}
