package arrayPrograms;

import java.util.Scanner;

public class SecondLargearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create Scanner class object to read input
	    Scanner scan = new Scanner(System.in);

	    // declare variables
	    int length = 0;
	    int numbers[] = null;

	    // take length of the array
	    System.out.print("Enter length of the array: ");
	    length = scan.nextInt();

	    // create array
	    numbers = new int[length];

	    // take array inputs
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = scan.nextInt();
	    }

	    // method call
	    System.out.println("Second largest element = " 
	                         + secondlargest(numbers));

	    // close Scanner
	    scan.close();
		
		
	}
	 // Method to find second largest number in array
	  public static int secondlargest(int[] arr) {
	    
	    // declare variables
	    int fmax = 0; 
	    int smax = 0; 

	    // assign first element to fmax, smax
	    fmax = arr[0];
	    smax = arr[0];

	    for (int i = 1; i < arr.length; i++) {
	      if (fmax < arr[i]) {
	        smax = fmax;
	        fmax = arr[i];
	      } else if(smax < arr[i]) {
	        smax = arr[i];
	      }
	    }

	    return smax;
	  }

}
