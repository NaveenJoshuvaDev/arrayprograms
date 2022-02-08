package arrayPrograms;

import java.util.Arrays;

public class Copyof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // original array
	      int arr[] = { 10, 20, 30, 40, 50 };
	   // copy array using Arrays.copyOf()
	      int []newArr=Arrays.copyOf(arr, arr.length);
	      System.out.println("Original Array = " + Arrays.toString(arr));
	      System.out.println("Copied Array = " + Arrays.toString(newArr));
	}

}
/*Additional Points,

This method throws NullPointerException if the passed original array is null. 
Therefore, it is better to check if(original != null) and then call copyOf().
It also throws NegativeArraySizeException if the passed length (i.e. newLength) is negative.

Since Arrays.copyOf() method internally using System.arraycopy() therefore it is also performing shallow copy.
*/