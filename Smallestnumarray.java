package arrayPrograms;

public class Smallestnumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {100,20,55,44,11,33};
		System.out.println(small(array));
		

	}
	public static int small(int []sm)
	{
		int min=0;
		min=sm[0];
		for(int i=1;i<sm.length;i++)
		{
		if(min>sm[i])
		
			min=sm[i];
			
		
	}
return min;
}
}
