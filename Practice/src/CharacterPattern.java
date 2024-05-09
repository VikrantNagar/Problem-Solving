import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i=0;i<n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				int k = i+j+1;
				System.out.print((char)(k+64));
				//k++;
			}
			System.out.println();
		}

	}

}
