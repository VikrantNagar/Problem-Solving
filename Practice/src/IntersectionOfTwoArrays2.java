import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoArrays2 {

	
		// TODO Auto-generated method stub
		public static void intersections(int arr[], int arr2[]) {
	    	//Your code goes here
			Arrays.sort(arr);
			Arrays.sort(arr2);

			int i = 0, j = 0;
			//declare arraylsit for dyanamic storage
			List<Integer> intersectionList = new ArrayList<>();

			while (i < arr.length && j < arr2.length) {
				if (arr[i] == arr2[j]) {
					intersectionList.add(arr[i]);
					i++;
					j++;
				} else if (arr[i] < arr2[j]) {
					i++;
				} else {
					j++;
				}
			}
			//traversing an array list......
			int[] intersectionArr = new int[intersectionList.size()];
			for (int k = 0; k < intersectionList.size(); k++) {
				intersectionArr[k] = intersectionList.get(k);
				System.out.print(intersectionArr[k]+" ");
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


