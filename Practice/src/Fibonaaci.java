import java.util.Scanner;

public class Fibonaaci {
	
	public static boolean F(int n) {
		
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo=0;
		if(n==1 || n==0) {
			return true;
		}
		int i = 2;
		//System.out.print(fibo1 + " " + fibo2);
		for(i=1;i<=n;i++)
		{
			fibo = fibo1 + fibo2;
			if(fibo==n)
			{
				return true;
				
			}
			fibo1 = fibo2;
			fibo2 = fibo;
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to check:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(F(n));
		sc.close();
		
	}

}
