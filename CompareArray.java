package arrayPrograms;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare and initialize arrays
	    int arr1[] = {10,20,30,40,50};
	    int arr2[] = arr1;
	    int arr3[] = {10,20,30,40,50};
	    int arr4[] = {15,25,35,45,55};
	    
	    // compare arrays using == operator
	    // compare arr1 and arr2
	    if(arr1 == arr2)
	      System.out.println("arr1 & arr2 are same");
	    else 
	      System.out.println("arr1 & arr2 are not same");
	    
	    // compare arr1 and arr3
	    if(arr1 == arr3)
	      System.out.println("arr1 & arr3 are same");
	    else 
	      System.out.println("arr1 & arr3 are not same");
	    
	    // compare arr1 and arr4
	    if(arr1 == arr4)
	      System.out.println("arr1 & arr4 are same");
	    else 
	      System.out.println("arr1 & arr4 are not same");
	  }
	
	}

/*
 Limitation with == operator:- For reference data types, the == operator compare only reference not the value or content. 
 To solve this problem equals() method came into the picture. 
 We had discussed these points in details in their respective post:- equals() method in Java and == vs equals() in Java.

The equals() method of the Object class also compare two objects based on their reference. 
If we want to compare two objects based on their values then we must override the equals() method.
 */
