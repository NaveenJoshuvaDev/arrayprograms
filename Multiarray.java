package arrayPrograms;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // declare and initialize an array
		int arr[] [] = {{50,60},{70,80},{90,100}};
		 // display array length
		System.out.println("The length of the given array =");
		System.out.println(arr.length);
		System.out.println("arr[0] length = " + arr[0].length);
		System.out.println("arr[1] length = " +arr[1].length);
		System.out.println("arr[2] length = " +arr[2].length);
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.println(arr[i].length);
        	 System.out.println("arr["+ i +"] length = " + arr[i].length);
         }
      // display 2D array using for loop  -this concept i dont know
         for(int i=0; i<arr.length; i++) {
        	  for(int j=0; j<arr[i].length; j++) {
        	    System.out.print(arr[i][j] + " ");
        	   
        	  }
        	}
	}

}
