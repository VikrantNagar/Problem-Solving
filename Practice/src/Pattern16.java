import java.util.Scanner;

public class Pattern16 {

       
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        if(n>0) {
        while(i<=n) 
        {
        	
        	if(i<=n&&i!=0) 
        	{
        		System.out.print("*");      		
       		}
        	int l = 1;
        	while(l<=i)
        	{
        		System.out.print(l);
        		l = l+1;
        	}
        	int k = i-1;
        	while(k>0)
        	{
        		System.out.print(k);
        		k = k-1;
        	}
        	
        	System.out.println("*");
        	i = i+1;
        	}
        }
        	
         i = n-1;
         while(i>=0) {
        	 
        	if(i<n&&i!=0)
        		System.out.print("*");
        	
        	int l = 1;
        	while(l<=i)
        	{
        		System.out.print(l);
        		l = l+1;
        	}
        	int  h= i-1;
        	while(h>0)
        	{
        		System.out.print(h);
        		h = h-1;
        	}
        	System.out.println("*");
        	i = i-1;
        }
        

    }   
	
}
