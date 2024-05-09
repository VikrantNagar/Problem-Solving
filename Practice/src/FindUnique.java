import java.util.Scanner;

public class FindUnique {

	
	 public static int findUnique(int[] arr){
			//Your code goes here
		 
		 int unique;
		 for(int i=0; i<arr.length ; i++)
		 {
			 unique = arr[i];
			 int count = 0;
			 for(int j=0 ; j<arr.length ; j++)
			 {
				 if(unique == arr[j]) {
					 count++;
				 }
				 
			 }
			 if(count ==1) {
				 return arr[i];
			 }
		 }
		 return -1;
		 
		 
	    }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		if(N>0) {
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		System.out.print(findUnique(arr));
		}
		}

	}

}
