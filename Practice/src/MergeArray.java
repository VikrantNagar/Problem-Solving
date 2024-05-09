import java.util.Scanner;

public class MergeArray {

	
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
		
		int j = 0, i=0, k=0;
		int m = arr1.length;
		int n = arr2.length;
		int arr3[] = new int[m+n];
		
		while(i<m && j<n) {
			
			if(arr1[i]<=arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
			
		}while(i<m) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
				
		return arr3;
	}
	
	
	
	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				int t = s.nextInt();
				for(int j = 0;j<t;j++)
				{	
				int N = s.nextInt();
				//if(N>0) {
				int arr1[] = new int[N];
				
				for(int i=0; i<N; i++)	
				{
					arr1[i] = s.nextInt();
				}
				
				int M = s.nextInt();
				//if(M>0) {
				int arr2[] = new int[M];
				
				for(int i=0; i<M; i++)	
				{
					arr2[i] = s.nextInt();
				}
				int arr3[] = merge(arr1,arr2);
				System.out.print(arr3);
				}
				}

			}
	


