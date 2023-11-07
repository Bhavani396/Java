package Arrays;

public class Array3D {
	
	

		public static void main(String[] args) {
			
			int c[][][]= {{{1,2},{3,4}} ,
						{{1,2,35}, {12,3,4,5}}};
			
			
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					for(int k=0;k<c[i][j].length;k++)
						System.out.print(c[i][j][k]+"\t");
					System.out.println();
				}
				System.out.println();
			}

		}

	}


