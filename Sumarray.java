package arrayPrograms;

import java.util.Scanner;

public class Sumarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array size");
	    int arr[]= null;
		int length=sc.nextInt();
		arr=new int[length];
		int avg;
	    int sum =0;
	    System.out.println("Enter the Array Input Values");
      for(int i=0;i<arr.length;i++)
      {
    	  //System.out.println(arr[i]);  
    	 // 
    	 
    	  arr[i]=sc.nextInt();
    	  sum=sum+arr[i];
      }
      System.out.print(sum);
      avg=sum/length;
      System.out.println();
      System.out.println("avg" + avg);
	}

}
