package arrayPrograms;
import java.util.Scanner;
public class Callarray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//my own method
/* Callarray ca =new Callarray();
  readArray();
 
	}
 public static int [] readArray()
 {
	 int[] arr= {10,20,30,40,50};
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 return arr;
 }
}
*/
		//knowprogram method
		 // read array from a method
	   /* int[] a = readArray();

	    // display array elements
	    for(int i=0; i < a.length; i++){
	      System.out.print(a[i] + "\t");
	    }
	  }

	  // method to return array elements
	  public static int[] readArray(){
	    int[] arr = {10,20,30,40};
	    return arr;
	  }

	}*/
		
		
//call array method using scanner class
		// read array from a method
		int [] a = readArray();
		
		  // display array elements
		 System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	// method to read array and
	  // return array elements
	public static int[] readArray()
	{
		//Declare variables
	
		int n=0;
		int [] arr=null;
		// Scanner class object to read input
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    n=sc.nextInt();
	    //Declare array
	    arr =new int[n];
	    //read array elements
	    System.out.println("Enter elements::");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    	
	    	
	    }
	    sc.close();
	    return arr;
	}
}
	    
	    
	    





















