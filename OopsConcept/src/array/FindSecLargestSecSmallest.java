package array;

import java.util.Arrays;
/*
 * Write a Java program to find the second smallest and second largest 
 * element in an array  
Original numeric array : [-1, 4, 0, 2, 7, -3]
[without using inbuilt method]
 */
public class FindSecLargestSecSmallest {

	public static void main(String[] args) {
		int arr[] = {-1, 4, 0, 2, 7, -3};
		System.out.println("Array is :" +Arrays.toString(arr));
		Arrays.sort(arr);
     //Using inbuild method
		System.out.println("**********Using inbuild method******************");
      //Smallest 
      System.out.println("second Smallest number is "+arr[1]);
      //Largest
      int L = arr.length;
      System.out.println("second Largest number is"+arr[L-1]);
      
		
      System.out.println("**********Using Logic******************");
      //using logic
		int count = arr.length;
		 for(int i=0;i<count;i++)
		 {
			 for(int j=i+1;j<count;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 int temp = arr[i];
					 arr[i]= arr[j];
					 arr[j] = temp;
					 
				 }
			 }
				 
		 }
		 System.out.println("smallest number is " +arr[0]);
		 System.out.println("Largest number is " +arr[count-1]);
		 System.out.println("Second Smallest number is " +arr[1]);
		 System.out.println("Second largest Number is " +arr[count-2]);
	}

}
