import java.util.Scanner;

public class RecursionCalciulatePower {
	
	public static int power(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		if(x==0) {
			return 0;
		}
		
		return x*power(x, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int n = s.nextInt();
		System.out.print(power(x,n));
		
		
	}

}
