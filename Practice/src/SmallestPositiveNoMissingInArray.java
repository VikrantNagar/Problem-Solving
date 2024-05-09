import java.util.Scanner;

public class SmallestPositiveNoMissingInArray {

	public static int smallestPositive(int[] arr) {
		
		int len  = arr.length;
		int sum = ((len+1)*(len+2))/2;
		for(int i=0 ; i<len ; i++) {
			sum = sum-arr[i];
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			 arr[i] = s.nextInt();
		}
		int no = smallestPositive(arr);
		System.out.println(no);

	}

}
