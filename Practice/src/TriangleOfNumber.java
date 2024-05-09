import java.util.Scanner;

public class TriangleOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i=1;i<=n;i++)
		{
			
			for(int j=i;j<n;j++)
			{
			
				System.out.print(" ");
				
			}
			for(int k=2*i-1;k>1;k--)
			{
			System.out.print(i);
			System.out.print(k);
		    }

		System.out.println();
		}

	}

}
