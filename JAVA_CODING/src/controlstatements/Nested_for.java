package controlstatements;

public class Nested_for {

	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1; i<=5; i++)    //outer loop, rows
		{
			for(j=1; j<=i; j++)  //inner loop, columns
				
			System.out.print(j+" ");
			
			System.out.println();
			
		}
	}

}

