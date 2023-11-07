package Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] b = {{1,2,4,9}
		             ,{2,3,5}}; // 2 rows , columns 4,5
		
		
		System.out.println("2D array with for loop");
		
		for(int i=0;i<b.length;i++) //rows:2
		{
			for(int j=0;j<b[i].length;j++) //columns:3
				System.out.print(b[i][j]+" ");
				System.out.println();
		}
		



	}

}


