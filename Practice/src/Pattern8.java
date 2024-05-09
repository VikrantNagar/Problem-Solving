import java.util.Scanner;

public class Pattern8 {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		while(i<=N)
		{
			int j=i;
			while(j<N)
			{
				System.out.print(" ");
				j = j+1;
			}
			int k = 1;
			while(k<=i)
			{
				System.out.print(k);
				k = k+1;
			}
			System.out.println();
			i = i+1;
		}

		
	}
	
}
