import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i=1;i<=n;i++)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
