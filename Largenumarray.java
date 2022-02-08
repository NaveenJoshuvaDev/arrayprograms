package arrayPrograms;

import java.util.Scanner;

public class Largenumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int  []arr= {10, 5, -15, 20, -30};
		System.out.println(largest(arr));
 
}
	// Java method to find largest number in array
	public static int largest(int[] array) {

	  // declare a variable max
	  int max = 0;

	  // assign first element to max
	  max = array[0];

	  // compare with remaining elements
	  // loop
	  for (int i = 1; i < array.length; i++) {
	    // compare 
	    if (max < array[i]) max = array[i];
	  }

	  return max;
	}
}
*/
		
		  // create Scanner class object to read input
	    Scanner scan = new Scanner(System.in);

	    // declare variables
	    int size = 0;
	    int arr[] = null;

	    // take length of the array
	    System.out.print("Enter length of the array: ");
	    size = scan.nextInt();

	    // create array
	    arr = new int[size];

	    // take array inputs
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < arr.length; i++) {
	      arr[i] = scan.nextInt();
	    }

	    // method call
	    System.out.println("Largest element = " + largest(arr));

	    // close Scanner
	    scan.close();
	  }
	
	 // Java method to find largest number in array
	  public static int largest(int[] array) {
	    
	    // declare a variable max
	    // assign first element to max
	    int max = array[0];

	    // compare with remaining elements
	    // loop
	    for (int i = 1; i < array.length; i++) {
	      if (max < array[i])
	        max = array[i];
	    }

	    return max;
	  }
	}
		
