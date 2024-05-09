import java.util.Scanner;

public class AlphaPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				int k = i;
				System.out.print((char)(k+64));
				//k++;
			}
			System.out.println();
		}

	}

}
