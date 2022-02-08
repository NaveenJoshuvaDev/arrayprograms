package arrayPrograms;

import java.util.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deep copy of an Array
/* int [] array1= {1,2,3};
 int [] array2=new int[3];
 System.out.println(array2[0]);
  for(int i=0;i<array1.length;i++) {
	  array2[i]=array1[i];
  }
  for(int i=0;i<array1.length;i++) {
	  System.out.print(array2[i]);
	  
  }
  System.out.println();
  for(int i=0;i<array1.length;i++) {
  System.out.print(array1[i]);
	}
	}
}*/
		
		//Deep copy In a deep copy, each element of the original array is assigned to a 
		//new array therefore whenever we change the content of the original array then the elements
		//of the newly created array won’t be affected.
		// original array
	/*	int arr[] = { 10, 20, 30, 40, 50 };
		// create new array with similar type and size
		int newArr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		// display array (Before Modification)
		System.out.println("Before Modification,");
		System.out.println("Original Array = " + Arrays.toString(arr));
		System.out.println("Copied Array = " + Arrays.toString(newArr));
		// modifying content of original array
		arr[0]=555;
		arr[3]=777;
		// display array (After Modification)
		System.out.println("\nAfter Modification,");
		System.out.println("Original Array = " + Arrays.toString(arr));
		System.out.println("Copied Array = " + Arrays.toString(newArr));
	}
}
		*/
		int[] a= {10,5};
		int []b=new int[2];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(b[i]);
	}
}
}