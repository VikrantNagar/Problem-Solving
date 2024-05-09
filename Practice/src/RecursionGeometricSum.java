import java.util.Scanner;

public class RecursionGeometricSum {
	
	public static double findGeometricSum(int k){
		
		if(k==0) {
			return 1;
			
		}
		double sum = 1/(double)Math.pow(2, k) + findGeometricSum(k-1);
		sum = Math.round(sum * 100000) / 100000.0;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.print(findGeometricSum(k));
		

	}

}
