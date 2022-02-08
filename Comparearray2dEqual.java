package arrayPrograms;

import java.util.Arrays;

public class Comparearray2dEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // declare and initialize 2D arrays
	    int arr1[][] = {{50,60},{70,80},{90,100}};
	    int arr2[][] = arr1;
	    int arr3[][] = {{50,60},{70,80},{90,100}};
	    int arr4[][] = {{55,66},{77,88},{99,100}};
	    
	    // compare arrays using Arrays.equals() method
	    // compare arr1 and arr2
	    if(Arrays.equals(arr1, arr2))
	      System.out.println("arr1 & arr2 are same");
	    else 
	      System.out.println("arr1 & arr2 are not same");
	    
	    // compare arr1 and arr3
	    if(Arrays.equals(arr1, arr3))
	      System.out.println("arr1 & arr3 are same");
	    else 
	      System.out.println("arr1 & arr3 are not same");
	    
	    // compare arr1 and arr4
	    if(Arrays.equals(arr1, arr4))
	      System.out.println("arr1 & arr4 are same");
	    else 
	      System.out.println("arr1 & arr4 are not same");
	  }
	}
		
		
	/*
In this program, arr1 and arr3 contain the same array elements but since the Arrays.equals() method is not able to compare multidimensional arrays,
 therefore, we got the wrong results. To solve this problem, we need to use Arrays.deepEquals() method.
*/