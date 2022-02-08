package arrayPrograms;

import java.util.Arrays;

public class Rangecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare array
		int array1[]= {1,2,3,4,5};
		//using copy of range
		//int array2[]=Arrays.copyOfRange(array1, 2, 5);//doubt
		//Display it
		int array2[]=Arrays.copyOfRange(array1, 0, array1.length);
		System.out.println("Orginal array"+ Arrays.toString(array1));
		System.out.println("duplicate array copof range array"+Arrays.toString(array2));
		
		
	
	}

}
/*
 *     original:- The array from which a range is to be copied.
    from:- The initial index of the range to be copied, it is inclusive.
    to:- the final index of the range to be copied, exclusive. This index may lie outside the array.
 */

