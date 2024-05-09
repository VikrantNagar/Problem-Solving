import java.util.Scanner;

public class InterestingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i=0;i<n;i++)
		{
			
			for(int j=i;j>=0;j--)
			{
			
				System.out.print((char)((n-j)+64));
				
			}
			System.out.println();
		}

	}

}
