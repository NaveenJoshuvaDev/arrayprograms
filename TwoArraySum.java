package arrayPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create Scanner class object
	    Scanner sc = new Scanner(System.in);

	    // take number of elements in both array
	    System.out.print("Enter number of elements in first array: ");
	    int arrayLength1=sc.nextInt();
	    System.out.print("Enter number of elements in second array: ");
	    int arrayLength2=sc.nextInt();	

	    // both array must have same number of elements
	    if(arrayLength1 != arrayLength2) {
	      System.out.println("Both array must have "+
	                      "same number of elements");
	      return; // stop 
	    }
	    // declare three array with given size
	    int array1[]=new int[arrayLength1];
	    int array2[]=new int[arrayLength2];
	    int array3[]=new int[arrayLength1];
	    // take input for array1 elements
	    System.out.println("Enter first array elements: ");
	    for (int i=0; i<array1.length; i++) {
	        array1[i] = sc.nextInt();
	      }
	    // take input for array2 elements
	    System.out.println("Enter second array elements: ");
	    for (int i=0; i<array1.length; i++) {
	        array2[i] = sc.nextInt();
	      }
	    // take input for array3 elements
	    System.out.println("Enter Third array elements: ");
	    for (int i=0; i<array1.length; i++) {
	        array3[i] = array1[i]+array2[i];
	    }
	        // display the third array
	        //System.out.println("Resultant Array: " 
	       //     + Arrays.toString(array3));
	    for (int i=0; i<array1.length; i++) {
	     System.out.println("result Array"+array3[i] );
	    }

	}
}
	    

