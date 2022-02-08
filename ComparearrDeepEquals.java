package arrayPrograms;

import java.util.Arrays;

public class ComparearrDeepEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // declare and initialize 2D arrays
	    int arr1[][] = {{50,60},{70,80},{90,100}};
	    int arr2[][] = arr1;
	    int arr3[][] = {{50,60},{70,80},{90,100}};
	    int arr4[][] = {{55,66},{77,88},{99,100}};
	    
	    // compare arrays using Arrays.equals() method
	    // compare arr1 and arr2
	    if(Arrays.deepEquals(arr1, arr2))
	      System.out.println("arr1 & arr2 are same");
	    else 
	      System.out.println("arr1 & arr2 are not same");
	    
	    // compare arr1 and arr3
	    if(Arrays.deepEquals(arr1, arr3))
	      System.out.println("arr1 & arr3 are same");
	    else 
	      System.out.println("arr1 & arr3 are not same");
	    
	    // compare arr1 and arr4
	    if(Arrays.deepEquals(arr1, arr4))
	      System.out.println("arr1 & arr4 are same");
	    else 
	      System.out.println("arr1 & arr4 are not same");
	  }
	}
		/*
		 * Arrays.deepEquals() method can compare only multidimensional array, not the single dimensional array.
		 * Arrays.deepEquals() method is able to compare all multidimensional arrays. 
		 */
		
		
	


