import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
	
		        // Write your code here
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int i = 2;
		        while(i<n)
		        {
		            if(n%i==0)
		            {
		                System.out.print(i+" ");
		            }
		            i=i+1;

		        }
		    }
		
	}

