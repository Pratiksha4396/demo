package string;

public class ReversePrintOdd {
/*
 * .A String is given remove the white spaces, reverse it and print the only odd position characters.
 * Given String is " Ivavsys  has a good team ".
 */
	public static void main(String[] args) {
		/*
		 * Remove Space
		 */
		String s1 = "  Ivavsys  has a good team  ";
		System.out.println(s1.trim());
		s1 = s1.replaceAll("\\s", "");
		System.out.println(s1);
		
		/*
		 * Reverse String
		 */
		String reverse = "";
		int length=s1.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+s1.charAt(i);
			System.out.println("Reversed string: "+reverse);
		
		/*
		 * 	 print the only odd position characters.
		 */
		for (int i=0;i<length;i++)
		 {
		     if(i%2==0)
		      {
		    	 System.out.println(s1.charAt(i));
		          
		      }
		   }  
			
		}

	}


