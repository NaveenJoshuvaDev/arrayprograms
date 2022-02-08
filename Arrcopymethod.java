package arrayPrograms;

import java.util.Arrays;

public class Arrcopymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// original array
      int array1[]= {1,2,3,4,5};
      // create new array with similar type and size
      int array2[]=new int[array1.length];
   // copy array using System.arraycopy
      System.arraycopy(array1, 0, array2, 0, array1.length);
      
      System.out.println("Original Array = " + Arrays.toString(array1));
      System.out.println("Copied Array = " + Arrays.toString(array2));
	}

}
//Syntax of the arraycopy() method in java.lang.System class:- public static native void 
//arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

//In this syntax,
/*
    src:- The source array.
    srcPos:- Starting position in the source array.
    dest:- The destination array.
    destPos:- starting position in the destination data.
    length:- the number of array elements to be copied.
*/
//Since java.lang.System class is imported by default in all Java classes 
//therefore to use arraycopy() method no need to explicitly import the System class.