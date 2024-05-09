import java.util.Scanner;

public class Pattern13 {

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
    	
    	int j = i-1;
    	while(j<N) 
    	{
    		System.out.print(j*2+1);
    		j = j+1;
    	}
    	int k = 0;
    	while(k<i-1)
    	{
    		
    			System.out.print(k * 2 + 1);
    			k = k+1;
    		
    	}
    	System.out.println();
    	i = i+1;
    } 
}	
}
