import java.util.Scanner;

public class RecursionMultiplication {
	
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n==0 || m ==0) {
			return 0;
		}
		return m + multiplyTwoIntegers(m,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		System.out.print(multiplyTwoIntegers(M, N));
		
		

	}

}
