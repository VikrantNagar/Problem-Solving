import java.util.Scanner;

public class Pattern11 {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	{
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");
		 
		char c = sc.next().charAt(0);
		int i=0;
		int j;
		while(i<=Math.ceil(n/2))
		{
		j=0;
		while(j<=Math.round(n/2)-1)
		 
		{
		System.out.print(" ");
		j = j+1;
		 
		}
		j=1;
		while(j<=i*2-1)
		 
		{
		System.out.print(c);
		j = j+1;
		 
		}
		 
		System.out.println();
		i++;
		} 
		i=n-1;
		while(i>0)
		{
		j=1;
		while(j<=n-i)
		 
		{
		System.out.print(" ");
		j = j+1;
		 
		} 
		j=1;
		while(j<=i*2-1)
		 
		{
		System.out.print(c);
		 j = j+1;
		}
		 
		System.out.println();
		i--;
		}
		 
		}
		}

	
}
