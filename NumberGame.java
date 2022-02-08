package arrayPrograms;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    Random ran = new Random();
	    int array1[] = new int[2];
	    		
	    int array2[]= new int[2];
	    int i=0;
	    int j=0;
	    // ask the length
	   // System.out.print("Enter array1 length: ");
	  //  int length1 = scan.nextInt();
	 //  System.out.print("Enter array2 length: ");
	 //   int length2 = scan.nextInt();
	    // assign size to the array
	   // array1 = new int[length1];
	 //   array2 = new int[length2];
	  //  // take input values
	    
	    for( i=0; i<array1.length; i++) {
	      array1[i] = ran.nextInt(9-0);
	      
	    }
	    System.out.println(array1.length);
	    // display the array using for loop
	    System.out.println("The Random  genrated array: ");
	    for( i=0; i<array1.length; i++) {
	      System.out.print(array1[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Enter array elements: ");
	    for( j=0; j<array2.length; j++) {
	    	array2[j]=scan.nextInt();
	    }
	
	    
	      
	      }
	    }

	


