package demo;

public class selectionsorting {

	public static void main(String[] args) {

		
		int arr[] = {30, 20, 10, 5, 2, 1};
		
		int n = arr.length;
		
		
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
			
			   if(arr[j] < arr[min])
			   {
				   min = j;
			   }
			   
			   
			}
			
			int temp  = 0;
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.print( arr[k]+" ");
		
		
	}

}
