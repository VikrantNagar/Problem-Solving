import java.util.Arrays;

public class ArrayMoveAllZeroToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s = new Scanner(System.in);
		
		int [] arr = {0,1,0,1,0,1};
//		Approach1 :: Using sorting of array
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length ; i++) {
//			System.out.print(arr[i]);
//		}
		
		//Approach 2 :: Using a new array of same length
		
		int len = arr.length;
		int [] arr1 = new int[len];
		int start=0;
		int last = len-1;
		for(int i=0 ; i<arr1.length ; i++) {
			if(arr[i]==0) {
				arr1[start] = arr[i];
				start++;
			}
			else if(arr[i]==1) {
				arr1[last] = arr[i];
				last--;
			}
			
		}
		System.out.print(Arrays.toString(arr1));
//		for(int i=0 ; i<arr1.length ; i++) {
//			System.out.print(arr1[i]);
//		}
		
		
	}

}
