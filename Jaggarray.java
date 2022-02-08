package arrayPrograms;

public class Jaggarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] [] a = {{10,20}, {30},{50,60,70},{80,90}};
         //Display the size of rray
         System.out.println("Array size="+ a.length);
         System.out.println("First row Size= " +a[0].length);
         System.out.println("Second row Size= "+a[1].length);
         System.out.println("Third row Size= "+a[2].length);
         System.out.println("Fourth row Size= "+a[3].length);
         
         //display array using length property
         System.out.println("Array elements");
         for(int i=0;i<a.length;i++)
         {
        	for(int j=0;j < a[i].length;j++) {
        		System.out.print(a[i][j]+"\t");
        		//System.out.println(a.hashCode());
        	}
         System.out.println();
         
	}

}
}
