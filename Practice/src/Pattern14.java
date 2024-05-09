import java.util.Scanner;

public class Pattern14 {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
        while(i<=n){
        	System.out.print("*");
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
//			int j=N;
//			while(j>=i)
//			{
//				System.out.print(N+1-i);
//				j = j-1;
//			}
//			System.out.println();
//			i = i+1;
//		}

		
	}
	
}
