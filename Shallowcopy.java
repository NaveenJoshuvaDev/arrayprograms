package arrayPrograms;

import java.util.Arrays;
//Shallow Copy of Array in Java using assignment Operator (=)
public class Shallowcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // original array
	      int arr[] = {10, 20, 30, 40, 50};
	      
	      // copy array using assignment operator
	      int newArr[] = arr;
	      
	      // display array
	      System.out.println("Original Array = " + Arrays.toString(arr));
	      System.out.println("Copied Array = " + Arrays.toString(newArr));
	   arr[0]=5;
	   // If we modify the content of the original array then 
	   //the content of the newly created array will also change
	   System.out.println("Original Array = " + Arrays.toString(arr));
	      System.out.println("Copied Array = " + Arrays.toString(newArr));
	   
	
	}

}
