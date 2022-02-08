package arrayPrograms;

import java.util.Random;
import java.util.Scanner;

public class Displayarray {
	 // declare and initialize an array
	static int[] arr = new int[6];
//static int  arr[] = {1,2,3,4,5};
	public static void main(String[] args) {
    // display the array using for loop
/*for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}

	
	
	 // display the array using for-each loop
	
	for(int i:arr)
	{
		System.out.print(i + " ");
	}
	*/
	//Adding element to an array via user input
		/*
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Elements to add in array");
	   for(int i=0; i < arr.length; i++) {
	        // read input
	    	arr[i]=sc.nextInt();
	    	 }
	
	   for(int i=0;i<arr.length;i++)
	   {
	   	System.out.println(arr[i]);
	   }
	   */
		 // create Scanner class object to read input
	    Scanner scan = new Scanner(System.in);
	    Random ran = new Random();
	    // declare an array variable of int type
	    int arr[] = null;
	    
	    // ask the length
	    System.out.print("Enter array length: ");
	    int length = scan.nextInt();
	    
	    // assign size to the array
	    arr = new int[length];
	    
	    // take input values
	    System.out.println("Enter array elements: ");
	    for(int i=0; i<arr.length; i++) {
	      arr[i] = ran.nextInt(9-0);
	    	//arr[i] =scan.nextInt();
	    }
	    
	    // display the array using for loop
	    System.out.println("The Entered array: ");
	    for(int i=0; i<arr.length; i++) {
	      System.out.print(arr[i] + " ");
	      
	    }
			//System.out.println(ran);
	}	
}
