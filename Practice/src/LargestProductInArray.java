import java.util.Scanner;

public class LargestProductInArray {
	
	public static int largestProduct(int arr[]) {
		
		int maxProd = 0;
		int prod = 0;
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			prod = arr[i] * arr[i+1];
			if(prod>maxProd) {
				maxProd = prod;
			}
		}
		return maxProd;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		int product  = largestProduct(arr);
		System.out.println(product);

	}

}
