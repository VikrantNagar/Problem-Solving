import java.util.Scanner;

public class IntersectionOfTwoArrays {

	
		// TODO Auto-generated method stub
		public static void intersections(int arr1[], int arr2[]) {
	    	//Your code goes here
			int intersection = 0;
			for(int i=0; i<arr1.length ; i++)
			{
				//if(intersection !=arr1[i]) {
				for(int k=0; k<arr1.length ; k++) {
					if(arr1[i]!=arr1[k]) {
						intersection = arr1[i];
					}
				}
				
				int count = 0;
				for(int j=0 ; j<arr2.length ; j++) {
					
					if(intersection == arr2[j]) {
					count++;	
					}
					
				}
				if(count>0) {
					System.out.print(arr1[i] + " ");
				}
				}
	    }
		
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{
			
		// First Array
		int N = s.nextInt();
		int arr1[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr1[i] = s.nextInt();
		}
		
		
		// Second Array
		int M = s.nextInt();
		int arr2[] = new int[M];
		
		for(int i=0; i<M; i++)	
		{
			arr2[i] = s.nextInt();
		}
		
		//Function Calling
		intersections(arr1,arr2);
		}
		
		}
	
}


