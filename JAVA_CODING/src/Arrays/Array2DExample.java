package Arrays;

public class Array2DExample {
	
public static void main(String[] args) {
			
		int [] a= {10,2,-30,4,50,56,34,67,34};   // one Dimention array initialization
			
			
		
		
			//sorting 
			int i, j,t;
			
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			
		
			
			//for each loop: To iterate all the elements in a arrays/collection
			
			System.out.println("1D array with for each loop");
			for (int element : a) 
			System.out.println(element);
			
					
			

		}

	}


