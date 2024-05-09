import java.util.Scanner;

public class MissingElementInArray {
	
	public static int missingElement(int arr[]) {
		
	//USING XOR Approach
		int len = arr.length;
		int x2 = 0;
		int x1 = arr[0];
		
		// XOR all number in the range from 0 to array length
		for(int i=0 ; i<=len ; i++) {
			x2 = x2 ^ i;
		}
		
		//XOR all elements present in array
		for(int i=0 ; i<len ; i++) {				
			x1 = x1 ^ arr[i];
		}
		
		return (x1^x2);
		
		
		// Logic with O(n) complexity Using SUM APPROACH
//		int len = arr.length;
//		int sum = ((len+1)*(len+2))/2;
//		for(int i=0 ; i<len ; i++) {
//			sum = sum-arr[i];
//			
//		}
//		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int arr []  = new int[N];
		for(int i=0 ; i<N ; i++) {
			
			arr[i] = s.nextInt();
		}

		System.out.print(missingElement(arr));
	}

}
