import java.util.Scanner;

public class RecursionFirstIndexNumberInArray {
	
		public static int firstIndex(int input[], int x) {
			
			if(input.length == 0) {
				return -1;
			}
			if(input[0]==x) {
				return 0;
			}
			int[] smallArray = new int[input.length-1];
			for(int i=1; i<input.length ; i++) {
				smallArray[i-1] = input[i];
			}
		  int i = firstIndex(smallArray, x);
		  if(i==-1) 
				return -1;
		  else
			  return i+1;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<arr.length ; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();

	 System.out.print(firstIndex(arr,x));
	}

}
